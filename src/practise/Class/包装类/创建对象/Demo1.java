package practise.Class.��װ��.��������;

public class Demo1 {
    public static void main(String[] args) {

        //JDK5��ǰ
        //1.���ù��췽����ȡInteger����
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        System.out.println(i1);
        System.out.println(i2);

        //2.���þ�̬������ȡInteger�Ķ���
        Integer i3 = Integer.valueOf(1);
        Integer i4 = Integer.valueOf("1");
        System.out.println(i3);
        System.out.println(i4);

        //3.�����ֻ�ȡ����ʽ������
        //ϸ�ڣ��ڵײ����ǰ����-128~127�Ķ����Խ�ʡ�ڴ�
        Integer i5 = Integer.valueOf(127);
        Integer i6 = Integer.valueOf(127);
        System.out.println(i5 == i6);   //true

        Integer i7 = Integer.valueOf(128);
        Integer i8 = Integer.valueOf(128);
        System.out.println(i7 == i8);   //false

        Integer i9 = new Integer(127);
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);  //false

        Integer i11 = new Integer(128);
        Integer i12 = new Integer(128);
        System.out.println(i11 == i12); //false
    }
}
