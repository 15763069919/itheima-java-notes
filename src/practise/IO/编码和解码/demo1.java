package practise.IO.����ͽ���;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //����
        String str = "ai��Ӵ";
        byte[] bytes1 = str.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        //����
        String str2 = new String(bytes1);   //ideaĬ��UTF-8���������Լ��ĳ���GBK
        System.out.println(str2);

        String str3 = new String(bytes2);
        System.out.println(str3);
    }
}
