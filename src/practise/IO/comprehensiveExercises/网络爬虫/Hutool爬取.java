package practise.IO.comprehensiveExercises.网络爬虫;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.IOException;
import java.util.*;

public class Hutool爬取 {
    public static void main(String[] args) throws IOException {
        //1.定义变量记录网址
        String familyNameNet = "https://zhuanlan.zhihu.com/p/392136002";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //3.利用正则表达式获取数据
        /*
        //3.通过正则表达式把其中符合要求的数据获取出来
        ArrayList<String> familyNameList = getData(familyNameStr, "([\\u4e00-\\u9fa5])\\(.{0,9}\\)", 1);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\u4E00-\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "([\u4E00-\u9FA5]{2} ){4}[\u4E00-\u9FA5]{2}", 0);
        */
        List<String> familyNameList = ReUtil.findAll("([\\u4e00-\\u9fa5])\\(.{0,9}\\)", familyNameStr, 1);
        List<String> boyNameTempList = ReUtil.findAll("([\u4E00-\u9FA5]{2})(、|。)", boyNameStr, 1);
        List<String> girlNameTempList = ReUtil.findAll("([\u4E00-\u9FA5]{2} ){4}[\u4E00-\u9FA5]{2}", girlNameStr, 0);
//        System.out.println(familyNameTempList);
//        System.out.println(boyNameTempList);
//        System.out.println(girlNameTempList);

        //4.处理数据
        //男生名字 -- 去重
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if (!boyNameList.contains(str)) {
                //System.out.println(str);
                boyNameList.add(str);
            }
        }
//        System.out.println(boyNameList);

        //女生名字 --
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] arr = str.split(" ");
            for (String s : arr) {
                girlNameList.add(s);
            }
        }
//        System.out.println(girlNameList);

        //5. 生成数据
        //姓名（唯一）-性别-年龄
        ArrayList<String> list = getInfos((ArrayList<String>) familyNameList, boyNameList, girlNameList, 70, 50);
        Collections.shuffle(list);
        System.out.println(list);

        //6.写出数据
       FileUtil.writeLines(list,"D:\\Work\\JAVA\\IdeaCode\\itheima\\itheima\\lib\\txt\\names.txt","UTF-8");
    }
    /*
     * 作用：
     *   获取男生和女生的信息：张三-男-23
     * 形参：
     *   参数一：装着姓氏的集合
     *   参数二：装着男生名字的集合
     *   参数三：装着女生名字的集合
     *   参数四：男生的个数
     *   参数五：女生的个数
     * 返回值：
     *   集合
     * */
    public static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        //1.生成男生不重复的名字
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() == boyCount) {
                break;
            } else {
                //随机
                //打乱集合
                Collections.shuffle(familyNameList);
                Collections.shuffle(boyNameList);
                boyhs.add(familyNameList.get(0) + boyNameList.get(0));
            }
        }
//        System.out.println(boyhs);
        //2.生成女生不重复的名字
        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == girlCount) {
                break;
            } else {
                //随机
                //打乱集合
                Collections.shuffle(familyNameList);
                Collections.shuffle(girlNameList);
                girlhs.add(familyNameList.get(0) + girlNameList.get(0));
            }
        }
//        System.out.println(girlhs);
        //3.生成男生的信息并添加到集合当中
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();

        for (String boyName : boyhs) {
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-男-" + age);
        }
        //4.生成男生的信息并添加到集合当中
        for (String girlName : girlhs) {
            int age = r.nextInt(8) + 18;
            list.add(girlName + "-女-" + age);
        }
        return list;
    }

}
