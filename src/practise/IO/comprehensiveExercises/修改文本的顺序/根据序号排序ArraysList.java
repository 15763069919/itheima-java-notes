package practise.IO.comprehensiveExercises.�޸��ı���˳��;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class �����������ArraysList {
    public static void main(String[] args) throws IOException {
        //�����ַ�����������
        BufferedReader br = new BufferedReader(new FileReader("lib/txt/csb.txt"));
        //��ȡ
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            //��ӽ�����
            list.add(line);
        }
        System.out.println(list);
        br.close();

        //����
//        Collections.sort(list, (o1, o2) -> Integer.parseInt(o1.split("\\.")[0]) - Integer.parseInt(o2.split("\\.")[0]));
        list.sort(Comparator.comparingInt(o -> Integer.parseInt(o.split("\\.")[0])));

        System.out.println(list);

        //д��
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/dest/csb.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
    }
}
