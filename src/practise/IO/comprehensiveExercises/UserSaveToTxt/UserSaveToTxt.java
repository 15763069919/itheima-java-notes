package practise.IO.comprehensiveExercises.UserSaveToTxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserSaveToTxt {
    public static void main(String[] args) throws IOException {
        //1.读取正确的用户名和密码
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

        //2.用户键盘录入用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        //3.比较
        if(rightUserName.equals(userName)&&rightPassword.equals(password)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }


    }
}
