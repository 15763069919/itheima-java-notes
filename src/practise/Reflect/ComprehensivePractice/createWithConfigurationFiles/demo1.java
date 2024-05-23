package practise.Reflect.ComprehensivePractice.createWithConfigurationFiles;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        //1.读取配置文件
        Properties prop = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/practise/Reflect/ComprehensivePractice/createWithConfigurationFiles/prop.properties")));
        prop.load(br);
        br.close();
        System.out.println(prop);

        //获取对象的全类名和方法名
        String className = (String) prop.get("classname");
        System.out.println(className);
        String methodName = (String) prop.get("method");
        System.out.println(methodName);

        //利用反射
        Class<?> clazz = Class.forName(className);

        //获取构造方法
        Constructor<?> dcon = clazz.getDeclaredConstructor();
        Object o = dcon.newInstance();
        System.out.println(o);

        //获取成员方法
        Method method = clazz.getMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);
    }
}
