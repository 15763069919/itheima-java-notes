package practise.IO.comprehensiveExercises;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class �޸��ļ��е����ݷǳ��淽ʽ {
    public static void main(String[] args) throws IOException {

        //1.��ȡ����
        FileReader fr = new FileReader("lib/txt/a.txt");
        int ch;
        StringBuilder sb = new StringBuilder();
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        System.out.println(sb);
        //2.����
        //���ַ��������Ϊstream��
        Integer[] array = Arrays.stream(sb.toString().split("-"))
                //ת��������
                .map(Integer::parseInt)
                //����
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
        //3.д������
        FileWriter fw = new FileWriter("lib/txt/a.txt");
        //������ת��Ϊ�ַ����������ַ����еĶ��ſո�ת��Ϊ��� [1, 2, 4, 7, 8, 9]
        String s = Arrays.toString(array).replace(", ", "-");
        //ȥ����β������ -- �ַ�����ȡ  [1-2-4-7-8-9]
        String result = s.substring(1, s.length() - 1);
        //д���ļ�
        fw.write(result);
        //�ͷ���Դ
        fw.close();
    }
}
