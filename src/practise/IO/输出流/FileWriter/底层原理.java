package practise.IO.�����.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class �ײ�ԭ�� {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("lib/txt/a.txt");
        /*for (int i = 0; i < 8192; i++) {
            fw.write(97);
        }
        fw.write(98);*/

        fw.write(97);
        fw.flush();
        fw.close();
    }
}
