package practise.IO.comprehensiveExercises.������д���;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //�����ֽڻ���������
        BufferedReader fr = new BufferedReader(new FileReader("lib/txt/codeRunNumber.txt"));
        //������
        int count = 0;
        //��¼��ȡ����һ������
        String line;
        while((line = fr.readLine()) != null){
            count = Integer.parseInt(line);
        }
        //�ͷ���Դ
        fr.close();
        if(count <= 3){
            System.out.println("��ӭʹ�ñ��������"+count+"��ʹ�����~");
        }else{
            System.out.println("�����ֻ���ʹ��3�Σ���ӭ��ע���Ա�����ʹ��~");
        }
        count++;
        //д��
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/txt/codeRunNumber.txt"));
        bw.write(count+"");
        bw.close();
    }
}
