package practise.IO.comprehensiveExercises.�޸��ı���˳��;

import java.io.*;
import java.util.TreeSet;

public class �����������TreeSet {

    public static void main(String[] args) throws IOException {
        //�����ַ�����������
        BufferedReader br = new BufferedReader(new FileReader("lib/txt/csb.txt"));
        //��ȡ���Զ�����
        String line;
        TreeSet<String> treeSet = new TreeSet<>();
        while ((line = br.readLine()) != null) {
            //��ӽ�����
            treeSet.add(line); //�Զ�����
        }
        br.close();
        System.out.println(treeSet);

        //д������
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/dest/csb.txt"));
        for (String s : treeSet) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

}
