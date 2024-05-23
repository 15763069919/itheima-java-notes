package practise.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class Constructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获取class文件
        Class<?> clazz = Class.forName("practise.Reflect.Student");

        //2.获取构造方法
        //所有公共
        java.lang.reflect.Constructor<?>[] cons = clazz.getConstructors();
        for (java.lang.reflect.Constructor<?> con : cons) {
            System.out.println(con);
        }

        System.out.println("===============================");


        //所有
        java.lang.reflect.Constructor<?>[] dcons = clazz.getDeclaredConstructors();
        for (java.lang.reflect.Constructor<?> dcon : dcons) {
            System.out.println(dcon);
        }

        System.out.println("===============================");


        //公共单个 --
        java.lang.reflect.Constructor<?> con1 = clazz.getConstructor();
        System.out.println(con1);
        //1获取权限修饰符
        int modifiers = con1.getModifiers();
        System.out.println(modifiers);
        //2获取参数的个数
        int parameterCount = con1.getParameterCount();
        System.out.println(parameterCount);
        //3获取参数类型数组
        Class<?>[] parameterTypes = con1.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameterType);
        }
        //4获取所有参数数组
        Parameter[] parameters = con1.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        //5获取对象 -- 可以传递参数，但是需要和创建con1的参数保持一致
        Student o = (Student) con1.newInstance();
        //同样不能用权限以外的构造方法
        //解决方法:
        //暴力反射：临时取消权限的校验
        con1.setAccessible(true);


        System.out.println("===============================");

        java.lang.reflect.Constructor<?> con2 = clazz.getConstructor(String.class);
        System.out.println(con2);

        System.out.println("===============================");

        //        java.lang.reflect.Constructor<?> con3 = clazz.getConstructor(int.class);
//        System.out.println(con3);     //err

        System.out.println("===============================");

        //        java.lang.reflect.Constructor<?> con4 = clazz.getConstructor(String.class, int.class);
//        System.out.println(con4);     //err

        System.out.println("*******************************************");


        //所有单个
        java.lang.reflect.Constructor<?> dcon1 = clazz.getDeclaredConstructor();
        System.out.println(dcon1);

        System.out.println("===============================");

        java.lang.reflect.Constructor<?> dcon2 = clazz.getDeclaredConstructor(String.class);
        System.out.println(dcon2);

        System.out.println("===============================");

        java.lang.reflect.Constructor<?> dcon3 = clazz.getDeclaredConstructor(int.class);
        System.out.println(dcon3);

        System.out.println("===============================");

        java.lang.reflect.Constructor<?> dcon4 = clazz.getDeclaredConstructor();
        System.out.println(dcon4);

    }
}
