package practise.IO.comprehensiveExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 大文件拷贝 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        FileOutputStream fos = new FileOutputStream("lib/directory/a.txt");
        //读取
        int len;
        byte[] bytes = new byte[1024*1024*5];
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);//最后一次可能装不满
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
