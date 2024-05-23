package practise.studentManagementSystem.学生管理系统再升级版;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        ArrayList<User> account = new ArrayList<>();
        while (true) {
            System.out.println("-----------------欢迎进入学生管理系统---------------");
            System.out.println("1:登录");
            System.out.println("2：注册");
            System.out.println("3：忘记密码");
            System.out.println("4:退出");
            //键入
            System.out.println("【系统】请键入操作：");
            Scanner sc = new Scanner(System.in);
            String loginChoose = sc.next();
            //操作选项
            switch (loginChoose) {
                case "1" -> login(account);
                case "2" -> register(account);
                case "3" -> forgetPassword(account);
                case "4" -> System.exit(0);
                default -> System.out.println("【系统】非法操作！");
            }
        }

    }

    //注册
    public static void register(ArrayList<User> account) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------注册---------------");
        //键盘录入用户名
        String newUsername;
        while (true) {
            System.out.println("【系统】请输入要注册的用户名：(输入<exit>退出)");
            newUsername = sc.next();
            //exit
            if (newUsername.equals("<exit>")) return;
            //1判断用户名长度必须在3-15位之间,只能是字母加数字的组合,但是不能是纯数字
            if (!isLegalUsername(newUsername)) {//不合法
                System.out.println("【系统】用户名格式错误！需在3-15位之间且不能为纯数字！(输入<exit>退出)");
                continue;
            }

            //2判断用户名唯一
            if (isContainsUsername(account, newUsername)) {//不可以注册;
                System.out.println("【系统】用户名存在！请重新输入(输入<exit>退出)");
                continue;
            }
            break;
        }
        //键盘录入密码
        String newPassword;
        while (true) {
            System.out.println("请设置密码:(输入<exit>退出)");
            newPassword = sc.next();
            //exit
            if (newPassword.equals("<exit>")) return;
            System.out.println("请重复输入密码：(输入<exit>退出)");
            String againNewPassword = sc.next();
            //exit
            if (againNewPassword.equals("<exit>")) return;
            if (newPassword.equals(againNewPassword)) {
                break;
            } else {
                System.out.println("两次密码输入不一致，请重新输入！(输入<exit>退出)");
            }
        }
        //键盘录入身份证号码
        String newIdCardNumber;
        while (true) {
            System.out.println("请输入您的身份证号：(输入<exit>退出)");
            newIdCardNumber = sc.next();
            //exit
            if (newIdCardNumber.equals("<exit>")) return;
            //判断身份证号
            if (isLegalIdCardNumber(newIdCardNumber)) {
                break;
            } else {
                System.out.println("【系统】身份证号码有误，请重新输入！(输入<exit>退出)");
                continue;
            }
        }
        //键盘录入手机号码
        String newPhoneNumber;
        while (true) {
            System.out.println("请输入手机号码：(输入<exit>退出)");
            newPhoneNumber = sc.next();
            //exit
            if (newPhoneNumber.equals("<exit>")) return;
            //判断手机号格式
            if (isLegalPhoneNumber(newPhoneNumber)) {
                break;
            } else {
                System.out.println("【系统】手机号码有误，请重新输入(输入<exit>退出)");
                continue;
            }
        }
        //放入对象
        User u = new User(newUsername, newPassword, newIdCardNumber, newPhoneNumber);
        //存入集合
        account.add(u);
        System.out.println("注册成功！");
        //遍历对象
        System.out.println("用户名：" + u.getUsername() + "\t密码："
                + u.getPassword() + "\t身份证号：" + u.getPersonID()
                + "\t手机号：" + u.getPhoneNumber());
    }

    //用户名注册验证:
    //1.用户名唯一
    public static boolean isContainsUsername(ArrayList<User> account, String newUsername) {
        for (int i = 0; i < account.size(); i++) {
            //集合中存在新用户名
            if (account.get(i).getUsername().equals(newUsername))
                return true;
        }
        return false;
    }

    //2.用户名格式合法
    public static boolean isLegalUsername(String newUsername) {
        int len = newUsername.length();
        if (len > 15 || len < 3) return false;
        int letterCount = 0;
        for (int i = 0; i < len; i++) {
            char c = newUsername.charAt(i);
            //出现其他字符,及规定字符的非
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) return false;
            //统计字母个数，而非统计数字个数（一个最大循环n次，一个一定循环n次）
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                letterCount++;
                break;//当检测到有字母，即不可能是纯数字
            }
        }
        return letterCount > 0;
    }

    //身份证注册验证
    //1.身份证格式合法：18位，不能以0开头，前17为都为数字，最后一位是数字或x或X
    public static boolean isLegalIdCardNumber(String newIdCardNumber) {
        //18位
        if (newIdCardNumber.length() != 18)
            return false;
        //0不开头
        //if(newIdCardNumber.charAt(0) =='0' ) return false;
        if (newIdCardNumber.startsWith("0"))//第一位如果是0返回true，否则返回false
            return false;
        //1-17位为数字
        for (int i = 0; i < newIdCardNumber.length() - 1; i++) {
            char c = newIdCardNumber.charAt(i);
            if (!(c <= '9' && c >= '0')) return false;
        }
        //18位为x或X或数字
        char endChar = newIdCardNumber.charAt(newIdCardNumber.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')) {
            return true;
        } else {
            return false;
        }
    }

    //手机号码格式验证
    public static boolean isLegalPhoneNumber(String newPhoneNumber) {
        //长度为11位
        if (newPhoneNumber.length() != 11) return false;
        //不能0开头
        if (newPhoneNumber.startsWith("0")) return false;
        //都为数字
        for (int i = 0; i < newPhoneNumber.length(); i++) {
            char c = newPhoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) return false;
        }
        return true;
    }

    //登录
    public static void login(ArrayList<User> account) {
        Scanner sc = new Scanner(System.in);
        //输入用户名
        System.out.println("请输入您的用户名：");
        String username = sc.next();
        //输入密码和验证码
        for (int i = 2; i >= 0; i--) {
            System.out.println("请输入密码：");
            String password = sc.next();
            //验证码验证
            while (true) {
                String verificationCode = createVerificationCode();
                System.out.println("请输入验证码：(验证码：" + verificationCode + ")");
                String userInputCode = sc.next();
                //判断验证码是否正确
                if (verificationCode.equals(userInputCode)) {//正确
                    break;
                } else {
                    System.out.println("验证码错误，请重新输入");
                    continue;
                }
            }
            //判断是否注册
            if (!isContainsUsername(account, username)) {//不包含（未注册）
                System.out.println("账号未注册，请先注册！");
                return;
            }
            //判断账号密码是否正确
            if (isAccountCorrect(account, username, password)) {//正确
                System.out.println("登录成功。。。");
                System.out.println("欢迎您，管理员");
                break;
            } else {
                if (i == 0) {
                    System.out.println("登录次数已用完，请稍后再试！");
                    return;
                } else {
                    System.out.println("账号或密码错误，请重新输入！还剩" + i + "次机会");
                    continue;
                }
            }

        }
        //进入学生管理系统
        StudentSystem ss = new StudentSystem();
        ss.startStudentSystem();

    }

    //验证码生成
    public static String createVerificationCode() {
        char[] verificationCode = new char[5];
        Random r = new Random();
        //生成数字
        int number = r.nextInt(9) + 1;//0~8+1=1~9
        //int->char
        char numberChar = (char) ('0' + number);
        //插入数字
        int index = r.nextInt(5);
        verificationCode[index] = numberChar;
        //随机字母并插入
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(52) + 1;//0~51+1=1~52
            char c = num > 26 ? (char) ('A' + num - 26-1) : (char) ('a' + num-1);
            if (verificationCode[i] != 0)
                continue;
            else verificationCode[i] = c;
        }
        return new String(verificationCode);
    }

    //验证码生成法二
    public static String getCode() {
        //将52个字母都添加进集合
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        //创建StringBuilder
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        int index = r.nextInt(5);
        for (int i = 0; i < 5; i++) {
            if (i == index) sb.append(r.nextInt(9) + 1);
            else {
                char c = list.get(r.nextInt(52));
                sb.append(c);
            }
        }
        return sb.toString();

    }

    //账号密码验证
    public static boolean isAccountCorrect(ArrayList<User> account, String username, String password) {
        for (int i = 0; i < account.size(); i++) {
            if (account.get(i).getUsername().equals(username)
                    && account.get(i).getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    //忘记密码
    public static void forgetPassword(ArrayList<User> account) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户：");
        String username = sc.next();
        //判断账户是否注册
        if (!isContainsUsername(account, username)) {//账户不存在
            System.out.println("该账户未注册！");
            return;
        }
        System.out.println("请输入您的手机号：");
        String phoneNumber = sc.next();
        System.out.println("请输入您的身份证号：");
        String idCardNumber = sc.next();
        //获取用户索引
        int index = 0;
        for (int i = 0; i < account.size(); i++) {//遍历集合
            if (account.get(i).getUsername().equals(username))
                index = i;
            else index = -1;
        }
        //验证信息
        if (isIdentityRight(account, index, username, phoneNumber, idCardNumber)) {//验证通过
            System.out.println("身份验证通过！");
        } else {
            System.out.println("身份信息有误！");
            return;
        }
        //修改密码
        while (true) {
            System.out.println("请输入新密码：");
            String newPassword = sc.next();
            System.out.println("请再次输入密码");
            String againNewPassword = sc.next();
            if (newPassword.equals(againNewPassword)) {
                System.out.println("密码修改成功！");
                account.get(index).setPassword(newPassword);
                return;
            } else {
                System.out.println("密码修改失败，请重新输入！");
            }
        }

    }

    //身份证号与手机号匹配用户名验证
    public static boolean isIdentityRight(ArrayList<User> account, int index, String userName, String phoneNumber, String idCardNumber) {
        User u = account.get(index);
        //此用户身份证号和手机号相同时
        if (u.getPhoneNumber().equals(phoneNumber) && u.getPersonID().equals(idCardNumber))
            return true;
        else return false;
    }
}