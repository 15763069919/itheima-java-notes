package learn.StringBuilder;

public class ���÷��� {
    public static void main(String[] args) {
        //1.��������
        StringBuilder sb = new StringBuilder("abc");

        //2.���Ԫ��    append
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        //��ӡ StringBuilder ����Ķ����ʱ��
        // ��Ϊ StringBuilder �� Java �Ѿ�д�õ��࣬
        // ��ӡ�����ǵ�ֵַ��������ֵ

        System.out.println(sb); //abc12.3true


        //3.��ת����    reverse
        sb.reverse();
        System.out.println(sb); //eurt3.21cba

        //4.��ȡ����    length
        int len = sb.length();
        System.out.println("����Ϊ"+len);

        //5.StringBuilder -> ѧϰ.String     toString
        String str = sb.toString();
        System.out.println(str);

    }
}
