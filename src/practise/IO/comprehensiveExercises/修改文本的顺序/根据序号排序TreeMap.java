package practise.IO.comprehensiveExercises.�޸��ı���˳��;

import java.io.*;
import java.util.Set;
import java.util.TreeMap;

public class �����������TreeMap {

    public static void main(String[] args) throws IOException {
        //�����ַ�����������
        BufferedReader br = new BufferedReader(new FileReader("lib/txt/csb.txt"));
        //��ȡ���Զ�����
        String line;
        TreeMap<Integer,String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            //��ӽ�����
            tm.put(Integer.parseInt(line.split("\\.")[0]),line.split("\\.")[1]); //�Զ�����
        }
        br.close();
        System.out.println(tm);

        //д������
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/dest/csb.txt"));
        Set<Integer> integers = tm.keySet();
        for (Integer integer : integers) {
            bw.write(integer+"."+tm.get(integer));
            bw.newLine();
        }
        bw.close();
    }

}
