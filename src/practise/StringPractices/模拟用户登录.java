package practise.StringPractices;

import java.util.Scanner;

public class ģ���û���¼ {
    public static void main(String[] args) {
        //1.��������������¼��ȷ���û���������
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        //2.����¼���û���������
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("�������û���");
            String username = sc.next();
            System.out.println("����������");
            String password = sc.next();

            //3.�Ƚ�
            if (username.equals(rightUsername) && password.equals(rightPassword))
                System.out.println("�û���¼�ɹ���");
            else if (i == 2)
                System.out.println("�����δ����˻�"+username+"������������ϵ����Ա");
            else
                System.out.println("�û���¼ʧ�ܣ��û�������������,����ʣ��" + (2 - i) + "�λ���");
        }


    }
}
