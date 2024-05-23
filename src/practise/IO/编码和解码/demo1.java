package practise.IO.编码和解码;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String str = "ai你哟";
        byte[] bytes1 = str.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        //解码
        String str2 = new String(bytes1);   //idea默认UTF-8，但是我自己改成了GBK
        System.out.println(str2);

        String str3 = new String(bytes2);
        System.out.println(str3);
    }
}
