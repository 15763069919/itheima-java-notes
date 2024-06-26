package learn.String;

public class CreateString {
    public static void main(String[] args) {
        //1.使用直接赋值的方式获取一个字符串对象
        String s1 = "abc";
        System.out.println(s1);

        //2.使用new的方式来获取一个字符串对象
        //空参构造
        String s2 = new String();
        System.out.println("@"+s2+"!");

        //3.传递一个字符串，根据传递的字符串内容再创建一个新的字符串
        String s3 = new String("abc");
        System.out.println(s3);

        //4.传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        //需求：修改字符串的内容。abc->qbc
        //abc -> {'a','b','c'} -> {'q','b','c'} -> "qbc"
        //字符串不可以发生变化，但字符数组可以发生变化
        char chs[] = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);

        //5.传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //应用场景：以后在网络当中传输的数据其实都是字节信息
        //我们要把字节信息进行转换成字符串，此时就用到这个构造
        byte bytes[] = {97,98,99,100};//ASCII码查后转换
        String s5 = new String(bytes);
        System.out.println(s5);//abc

    }
}
