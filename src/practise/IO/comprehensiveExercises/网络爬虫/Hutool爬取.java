package practise.IO.comprehensiveExercises.��������;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.IOException;
import java.util.*;

public class Hutool��ȡ {
    public static void main(String[] args) throws IOException {
        //1.���������¼��ַ
        String familyNameNet = "https://zhuanlan.zhihu.com/p/392136002";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.��ȡ����
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //3.����������ʽ��ȡ����
        /*
        //3.ͨ��������ʽ�����з���Ҫ������ݻ�ȡ����
        ArrayList<String> familyNameList = getData(familyNameStr, "([\\u4e00-\\u9fa5])\\(.{0,9}\\)", 1);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\u4E00-\u9FA5]{2})(��|��)", 1);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "([\u4E00-\u9FA5]{2} ){4}[\u4E00-\u9FA5]{2}", 0);
        */
        List<String> familyNameList = ReUtil.findAll("([\\u4e00-\\u9fa5])\\(.{0,9}\\)", familyNameStr, 1);
        List<String> boyNameTempList = ReUtil.findAll("([\u4E00-\u9FA5]{2})(��|��)", boyNameStr, 1);
        List<String> girlNameTempList = ReUtil.findAll("([\u4E00-\u9FA5]{2} ){4}[\u4E00-\u9FA5]{2}", girlNameStr, 0);
//        System.out.println(familyNameTempList);
//        System.out.println(boyNameTempList);
//        System.out.println(girlNameTempList);

        //4.��������
        //�������� -- ȥ��
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if (!boyNameList.contains(str)) {
                //System.out.println(str);
                boyNameList.add(str);
            }
        }
//        System.out.println(boyNameList);

        //Ů������ --
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] arr = str.split(" ");
            for (String s : arr) {
                girlNameList.add(s);
            }
        }
//        System.out.println(girlNameList);

        //5. ��������
        //������Ψһ��-�Ա�-����
        ArrayList<String> list = getInfos((ArrayList<String>) familyNameList, boyNameList, girlNameList, 70, 50);
        Collections.shuffle(list);
        System.out.println(list);

        //6.д������
       FileUtil.writeLines(list,"D:\\Work\\JAVA\\IdeaCode\\itheima\\itheima\\lib\\txt\\names.txt","UTF-8");
    }
    /*
     * ���ã�
     *   ��ȡ������Ů������Ϣ������-��-23
     * �βΣ�
     *   ����һ��װ�����ϵļ���
     *   ��������װ���������ֵļ���
     *   ��������װ��Ů�����ֵļ���
     *   �����ģ������ĸ���
     *   �����壺Ů���ĸ���
     * ����ֵ��
     *   ����
     * */
    public static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        //1.�����������ظ�������
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() == boyCount) {
                break;
            } else {
                //���
                //���Ҽ���
                Collections.shuffle(familyNameList);
                Collections.shuffle(boyNameList);
                boyhs.add(familyNameList.get(0) + boyNameList.get(0));
            }
        }
//        System.out.println(boyhs);
        //2.����Ů�����ظ�������
        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == girlCount) {
                break;
            } else {
                //���
                //���Ҽ���
                Collections.shuffle(familyNameList);
                Collections.shuffle(girlNameList);
                girlhs.add(familyNameList.get(0) + girlNameList.get(0));
            }
        }
//        System.out.println(girlhs);
        //3.������������Ϣ����ӵ����ϵ���
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();

        for (String boyName : boyhs) {
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-��-" + age);
        }
        //4.������������Ϣ����ӵ����ϵ���
        for (String girlName : girlhs) {
            int age = r.nextInt(8) + 18;
            list.add(girlName + "-Ů-" + age);
        }
        return list;
    }

}
