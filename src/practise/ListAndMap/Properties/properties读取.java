package practise.ListAndMap.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties读取 {
    public static void main(String[] args) throws IOException {
        //1.创建集合
        Properties p = new Properties();
        //2.读取本地Properties文件里面的数据
        FileInputStream fis = new FileInputStream("src/practise/ListAndMap/Properties/a.properties");
        p.load(fis);
        fis.close();
        //3.打印集合
        System.out.println(p);
    }
}
