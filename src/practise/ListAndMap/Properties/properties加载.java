package practise.ListAndMap.Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesº”‘ÿ {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.put("aaa","bbb");
        p.put("ccc","ddd");
        p.put("eee","fff");

        FileOutputStream fos = new FileOutputStream("src/practise/ListAndMap/Properties/a.properties");
        p.store(fos,"test");
        fos.close();


    }
}
