package practise.ListAndMap.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties��ȡ {
    public static void main(String[] args) throws IOException {
        //1.��������
        Properties p = new Properties();
        //2.��ȡ����Properties�ļ����������
        FileInputStream fis = new FileInputStream("src/practise/ListAndMap/Properties/a.properties");
        p.load(fis);
        fis.close();
        //3.��ӡ����
        System.out.println(p);
    }
}
