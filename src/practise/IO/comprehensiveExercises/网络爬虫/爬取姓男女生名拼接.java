package practise.IO.comprehensiveExercises.��������;

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

public class ��ȡ����Ů����ƴ�� {
    public static void main(String[] args) throws IOException {
        /*
         * ���ϣ�https://zhuanlan.zhihu.com/p/392136002
         *   ������http://www.haoming8.cn/baobao/10881.html
         *   Ů����http://www.haoming8.cn/baobao/7641.html
         * */

        //1.���������¼��ַ
        String familyNameNet = "https://zhuanlan.zhihu.com/p/392136002";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.��ȡ����, ����ַ�����е�����ƴ�ӳ�һ���ַ���
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

//        System.out.println(familyNameStr);

        //3.ͨ��������ʽ�����з���Ҫ������ݻ�ȡ����
        ArrayList<String> familyNameList = getData(familyNameStr, "([\\u4e00-\\u9fa5])\\(.{0,9}\\)", 1);
//        System.out.println(familyNameTempList);

        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\u4E00-\u9FA5]{2})(��|��)", 1);
//        System.out.println(boyNameTempList);

        ArrayList<String> girlNameTempList = getData(girlNameStr, "([\u4E00-\u9FA5]{2} ){4}[\u4E00-\u9FA5]{2}", 0);
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
        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 70, 50);
        Collections.shuffle(list);
        System.out.println(list);

        //6.д������
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/txt/name.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();

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


    /*
     * ���ã�����������ʽ��ȡ�ַ����е�����
     * ����һ���������ַ���
     * ��������������ʽ
     * ��������������
     *
     * ����ֵ��������Ҫ������
     *
     * */

    private static ArrayList<String> getData(String str, String regex, int index) {
        //1.�������������������
        ArrayList<String> list = new ArrayList<>();
        //2.����������ʽ��ȡ����
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        //����pattern�Ĺ��򣬵�str�л�ȡ����
        while (matcher.find()) {
            String group = matcher.group(index);
            list.add(group);
//            System.out.print(group);
        }
        return list;
    }

    /*
     * ���ã�
     *   ����������ȡ���ݣ�������ƴ�ӳ��ַ�������
     * �βΣ�
     *   ��ַ
     * ����ֵ��
     *   ��ȡ��������
     * */
    public static String webCrawler(String net) throws IOException {
        //1.����StringBuilderƴ����ȡ��������
        StringBuilder sb = new StringBuilder();
        //2.����һ��URL����
        URL url = new URL(net);
        //3.�����������ַ
        //ϸ�ڣ���֤���糩ͨ����ַ������
        URLConnection conn = url.openConnection();
        //4.��ȡ����
        //����url�ϻ�ȡ���ֽ���ת���ַ��� -- ��Ϊ��վ��������
        InputStreamReader isr = new InputStreamReader(conn.getInputStream(), Charset.forName("UTF-8"));
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        //5.�ͷ���Դ
        isr.close();
        //6.�Ѷ�ȡ�������ݷ���
        return sb.toString();

    }


}
