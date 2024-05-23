package practise.IO.comprehensiveExercises;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class �޸��ļ��е����ݳ��淽ʽ {
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
        String[] strings = sb.toString().split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : strings) {
            int i = Integer.parseInt(s);
            //��ӵ�����
            list.add(i);
        }
        System.out.println(list);
        //����
        Collections.sort(list);
        System.out.println(list);
        //3.д������
        FileWriter fw = new FileWriter("lib/txt/a.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                fw.write(list.get(i)+"");
            }else {
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();
    }
}
