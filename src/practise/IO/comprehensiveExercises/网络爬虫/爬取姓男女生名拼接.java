package practise.IO.comprehensiveExercises.网络爬虫;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 爬取姓男女生名拼接 {
    public static void main(String[] args) throws IOException {
        /*
         * 姓氏：https://zhuanlan.zhihu.com/p/392136002
         *   男名：http://www.haoming8.cn/baobao/10881.html
         *   女名：http://www.haoming8.cn/baobao/7641.html
         * */

        //1.定义变量记录网址
        String familyNameNet = "https://zhuanlan.zhihu.com/p/392136002";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据, 把网址上所有的数据拼接成一个字符串
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

//        System.out.println(familyNameStr);

        //3.通过正则表达式把其中符合要求的数据获取出来
        ArrayList<String> familyNameList = getData(familyNameStr, "([\\u4e00-\\u9fa5])\\(.{0,9}\\)", 1);
//        System.out.println(familyNameTempList);

        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\u4E00-\u9FA5]{2})(、|。)", 1);
//        System.out.println(boyNameTempList);

        ArrayList<String> girlNameTempList = getData(girlNameStr, "([\u4E00-\u9FA5]{2} ){4}[\u4E00-\u9FA5]{2}", 0);
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
        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 70, 50);
        Collections.shuffle(list);
        System.out.println(list);

        //6.写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/txt/name.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();

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


    /*
     * 作用：根据正则表达式获取字符串中的数据
     * 参数一：完整的字符串
     * 参数二：正则表达式
     * 参数三：？？？
     *
     * 返回值：真正想要的数据
     *
     * */

    private static ArrayList<String> getData(String str, String regex, int index) {
        //1.创建集合用来存放数据
        ArrayList<String> list = new ArrayList<>();
        //2.按照正则表达式获取数据
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        //按照pattern的规则，到str中获取数据
        while (matcher.find()) {
            String group = matcher.group(index);
            list.add(group);
//            System.out.print(group);
        }
        return list;
    }

    /*
     * 作用：
     *   从网络中爬取数据，把数据拼接成字符串返回
     * 形参：
     *   网址
     * 返回值：
     *   爬取到的数据
     * */
    public static String webCrawler(String net) throws IOException {
        //1.定义StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //2.创建一个URL对象
        URL url = new URL(net);
        //3.连接上这个网址
        //细节：保证网络畅通，网址可连接
        URLConnection conn = url.openConnection();
        //4.读取数据
        //将从url上获取的字节流转成字符流 -- 因为网站上有中文
        InputStreamReader isr = new InputStreamReader(conn.getInputStream(), Charset.forName("UTF-8"));
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        //5.释放资源
        isr.close();
        //6.把读取到的数据返回
        return sb.toString();

    }


}
