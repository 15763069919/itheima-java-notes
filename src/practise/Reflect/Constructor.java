package practise.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class Constructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.��ȡclass�ļ�
        Class<?> clazz = Class.forName("practise.Reflect.Student");

        //2.��ȡ���췽��
        //���й���
        java.lang.reflect.Constructor<?>[] cons = clazz.getConstructors();
        for (java.lang.reflect.Constructor<?> con : cons) {
            System.out.println(con);
        }

        System.out.println("===============================");


        //����
        java.lang.reflect.Constructor<?>[] dcons = clazz.getDeclaredConstructors();
        for (java.lang.reflect.Constructor<?> dcon : dcons) {
            System.out.println(dcon);
        }

        System.out.println("===============================");


        //�������� --
        java.lang.reflect.Constructor<?> con1 = clazz.getConstructor();
        System.out.println(con1);
        //1��ȡȨ�����η�
        int modifiers = con1.getModifiers();
        System.out.println(modifiers);
        //2��ȡ�����ĸ���
        int parameterCount = con1.getParameterCount();
        System.out.println(parameterCount);
        //3��ȡ������������
        Class<?>[] parameterTypes = con1.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameterType);
        }
        //4��ȡ���в�������
        Parameter[] parameters = con1.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        //5��ȡ���� -- ���Դ��ݲ�����������Ҫ�ʹ���con1�Ĳ�������һ��
        Student o = (Student) con1.newInstance();
        //ͬ��������Ȩ������Ĺ��췽��
        //�������:
        //�������䣺��ʱȡ��Ȩ�޵�У��
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


        //���е���
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
