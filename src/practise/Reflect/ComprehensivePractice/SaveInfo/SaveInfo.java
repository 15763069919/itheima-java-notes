package practise.Reflect.ComprehensivePractice.SaveInfo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.util.UUID;

public class SaveInfo {
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException {
        Student s1 = new Student("小A", 23, '女', 167.5, "睡觉");
        saveToFile(s1);
        Teacher t1 = new Teacher("波妞",10000);
        saveToFile(t1);

    }

    public static void saveToFile(Object obj) throws NoSuchMethodException, IOException, IllegalAccessException {
        //获取对象的字节码对象
        Class<?> clazz = obj.getClass();
        //获取字节码对象的字段数组
        Field[] dfs = clazz.getDeclaredFields();
        //随机UUID
        String uuid = UUID.randomUUID().toString().replace("-", "");
        //创建字符流
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/practise/Reflect/ComprehensivePractice/SaveInfo/"+uuid+".txt")));
        //遍历字段数组
        for (Field df : dfs) {
            //暴力反射
            df.setAccessible(true);
            //写入文件
            br.write(df.getName() + "=" + df.get(obj));
            br.newLine();
//            System.out.println(df.get(obj));
        }
        //刷新缓冲区
        br.flush();
        //关流
        br.close();

    }
}
