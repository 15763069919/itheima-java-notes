package practise.IO.comprehensiveExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class �ļ����� {
    public static void main(String[] args) throws IOException {
        /*
           ^ ��� -- ��ͬΪfalse����ͬΪtrue
           true ^ true = false
           false ^ false = false
           false ^ true  = true


      100 ^ 10 = 110:
            ת���ɶ����ƣ�
                100 ->  64 + 32 + 4 ->  1 1 0 0 1 0 0
                10  ->  8 + 2       ->  0 0 0 1 0 1 0
            ������㣺
                    1 1 0 0 1 0 0
                  ^ 0 0 0 1 0 1 0
                  ����������������������������������
                    1 1 0 1 1 1 0   -> 64 + 32 + 8 + 4 + 2 = 110

      110 ^ 10 = 100

      �ܽ᣺   1.  A ^ B ^ B = A   һ������������0
              2.  A ^ 0 = A       һ�������0���ڱ���

       * */

        //1.�����������ԭʼ�ļ�
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        //2.����������������ļ�
        FileOutputStream fos = new FileOutputStream("lib/txt/ency.txt");
        //3.�����ļ�
        int b;
        while((b = fis.read()) != -1){
            fos.write(b^2);
        }
        //4.�ͷ���Դ
        fos.close();
        fis.close();

    }
}
