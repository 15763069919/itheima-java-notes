package practise.IO.comprehensiveExercises.UserSaveToTxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserSaveToTxt {
    public static void main(String[] args) throws IOException {
        //1.��ȡ��ȷ���û���������
        BufferedReader br= new BufferedReader(new FileReader("src/practise/IO/comprehensiveExercises/UserSaveToTxt/userInfo.txt"));
        String line = br.readLine();
        System.out.println(line);

        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");

        String rightUserName = arr1[1];
        String rightPassword = arr2[1];

        System.out.println(rightUserName);
        System.out.println(rightPassword);

        //2.�û�����¼���û���
        Scanner sc = new Scanner(System.in);
        System.out.println("�������û���");
        String userName = sc.nextLine();
        System.out.println("����������");
        String password = sc.nextLine();

        //3.�Ƚ�
        if(rightUserName.equals(userName)&&rightPassword.equals(password)){
            System.out.println("��¼�ɹ�");
        }else {
            System.out.println("��¼ʧ��");
        }


    }
}
