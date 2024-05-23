package practise.Reflect.ComprehensivePractice.SaveInfo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.util.UUID;

public class SaveInfo {
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException {
        Student s1 = new Student("СA", 23, 'Ů', 167.5, "˯��");
        saveToFile(s1);
        Teacher t1 = new Teacher("���",10000);
        saveToFile(t1);

    }

    public static void saveToFile(Object obj) throws NoSuchMethodException, IOException, IllegalAccessException {
        //��ȡ������ֽ������
        Class<?> clazz = obj.getClass();
        //��ȡ�ֽ��������ֶ�����
        Field[] dfs = clazz.getDeclaredFields();
        //���UUID
        String uuid = UUID.randomUUID().toString().replace("-", "");
        //�����ַ���
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/practise/Reflect/ComprehensivePractice/SaveInfo/"+uuid+".txt")));
        //�����ֶ�����
        for (Field df : dfs) {
            //��������
            df.setAccessible(true);
            //д���ļ�
            br.write(df.getName() + "=" + df.get(obj));
            br.newLine();
//            System.out.println(df.get(obj));
        }
        //ˢ�»�����
        br.flush();
        //����
        br.close();

    }
}
