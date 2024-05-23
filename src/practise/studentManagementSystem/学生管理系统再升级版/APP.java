package practise.studentManagementSystem.ѧ������ϵͳ��������;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        ArrayList<User> account = new ArrayList<>();
        while (true) {
            System.out.println("-----------------��ӭ����ѧ������ϵͳ---------------");
            System.out.println("1:��¼");
            System.out.println("2��ע��");
            System.out.println("3����������");
            System.out.println("4:�˳�");
            //����
            System.out.println("��ϵͳ������������");
            Scanner sc = new Scanner(System.in);
            String loginChoose = sc.next();
            //����ѡ��
            switch (loginChoose) {
                case "1" -> login(account);
                case "2" -> register(account);
                case "3" -> forgetPassword(account);
                case "4" -> System.exit(0);
                default -> System.out.println("��ϵͳ���Ƿ�������");
            }
        }

    }

    //ע��
    public static void register(ArrayList<User> account) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------ע��---------------");
        //����¼���û���
        String newUsername;
        while (true) {
            System.out.println("��ϵͳ��������Ҫע����û�����(����<exit>�˳�)");
            newUsername = sc.next();
            //exit
            if (newUsername.equals("<exit>")) return;
            //1�ж��û������ȱ�����3-15λ֮��,ֻ������ĸ�����ֵ����,���ǲ����Ǵ�����
            if (!isLegalUsername(newUsername)) {//���Ϸ�
                System.out.println("��ϵͳ���û�����ʽ��������3-15λ֮���Ҳ���Ϊ�����֣�(����<exit>�˳�)");
                continue;
            }

            //2�ж��û���Ψһ
            if (isContainsUsername(account, newUsername)) {//������ע��;
                System.out.println("��ϵͳ���û������ڣ�����������(����<exit>�˳�)");
                continue;
            }
            break;
        }
        //����¼������
        String newPassword;
        while (true) {
            System.out.println("����������:(����<exit>�˳�)");
            newPassword = sc.next();
            //exit
            if (newPassword.equals("<exit>")) return;
            System.out.println("���ظ��������룺(����<exit>�˳�)");
            String againNewPassword = sc.next();
            //exit
            if (againNewPassword.equals("<exit>")) return;
            if (newPassword.equals(againNewPassword)) {
                break;
            } else {
                System.out.println("�����������벻һ�£����������룡(����<exit>�˳�)");
            }
        }
        //����¼�����֤����
        String newIdCardNumber;
        while (true) {
            System.out.println("�������������֤�ţ�(����<exit>�˳�)");
            newIdCardNumber = sc.next();
            //exit
            if (newIdCardNumber.equals("<exit>")) return;
            //�ж����֤��
            if (isLegalIdCardNumber(newIdCardNumber)) {
                break;
            } else {
                System.out.println("��ϵͳ�����֤�����������������룡(����<exit>�˳�)");
                continue;
            }
        }
        //����¼���ֻ�����
        String newPhoneNumber;
        while (true) {
            System.out.println("�������ֻ����룺(����<exit>�˳�)");
            newPhoneNumber = sc.next();
            //exit
            if (newPhoneNumber.equals("<exit>")) return;
            //�ж��ֻ��Ÿ�ʽ
            if (isLegalPhoneNumber(newPhoneNumber)) {
                break;
            } else {
                System.out.println("��ϵͳ���ֻ�������������������(����<exit>�˳�)");
                continue;
            }
        }
        //�������
        User u = new User(newUsername, newPassword, newIdCardNumber, newPhoneNumber);
        //���뼯��
        account.add(u);
        System.out.println("ע��ɹ���");
        //��������
        System.out.println("�û�����" + u.getUsername() + "\t���룺"
                + u.getPassword() + "\t���֤�ţ�" + u.getPersonID()
                + "\t�ֻ��ţ�" + u.getPhoneNumber());
    }

    //�û���ע����֤:
    //1.�û���Ψһ
    public static boolean isContainsUsername(ArrayList<User> account, String newUsername) {
        for (int i = 0; i < account.size(); i++) {
            //�����д������û���
            if (account.get(i).getUsername().equals(newUsername))
                return true;
        }
        return false;
    }

    //2.�û�����ʽ�Ϸ�
    public static boolean isLegalUsername(String newUsername) {
        int len = newUsername.length();
        if (len > 15 || len < 3) return false;
        int letterCount = 0;
        for (int i = 0; i < len; i++) {
            char c = newUsername.charAt(i);
            //���������ַ�,���涨�ַ��ķ�
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) return false;
            //ͳ����ĸ����������ͳ�����ָ�����һ�����ѭ��n�Σ�һ��һ��ѭ��n�Σ�
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                letterCount++;
                break;//����⵽����ĸ�����������Ǵ�����
            }
        }
        return letterCount > 0;
    }

    //���֤ע����֤
    //1.���֤��ʽ�Ϸ���18λ��������0��ͷ��ǰ17Ϊ��Ϊ���֣����һλ�����ֻ�x��X
    public static boolean isLegalIdCardNumber(String newIdCardNumber) {
        //18λ
        if (newIdCardNumber.length() != 18)
            return false;
        //0����ͷ
        //if(newIdCardNumber.charAt(0) =='0' ) return false;
        if (newIdCardNumber.startsWith("0"))//��һλ�����0����true�����򷵻�false
            return false;
        //1-17λΪ����
        for (int i = 0; i < newIdCardNumber.length() - 1; i++) {
            char c = newIdCardNumber.charAt(i);
            if (!(c <= '9' && c >= '0')) return false;
        }
        //18λΪx��X������
        char endChar = newIdCardNumber.charAt(newIdCardNumber.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')) {
            return true;
        } else {
            return false;
        }
    }

    //�ֻ������ʽ��֤
    public static boolean isLegalPhoneNumber(String newPhoneNumber) {
        //����Ϊ11λ
        if (newPhoneNumber.length() != 11) return false;
        //����0��ͷ
        if (newPhoneNumber.startsWith("0")) return false;
        //��Ϊ����
        for (int i = 0; i < newPhoneNumber.length(); i++) {
            char c = newPhoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) return false;
        }
        return true;
    }

    //��¼
    public static void login(ArrayList<User> account) {
        Scanner sc = new Scanner(System.in);
        //�����û���
        System.out.println("�����������û�����");
        String username = sc.next();
        //�����������֤��
        for (int i = 2; i >= 0; i--) {
            System.out.println("���������룺");
            String password = sc.next();
            //��֤����֤
            while (true) {
                String verificationCode = createVerificationCode();
                System.out.println("��������֤�룺(��֤�룺" + verificationCode + ")");
                String userInputCode = sc.next();
                //�ж���֤���Ƿ���ȷ
                if (verificationCode.equals(userInputCode)) {//��ȷ
                    break;
                } else {
                    System.out.println("��֤���������������");
                    continue;
                }
            }
            //�ж��Ƿ�ע��
            if (!isContainsUsername(account, username)) {//��������δע�ᣩ
                System.out.println("�˺�δע�ᣬ����ע�ᣡ");
                return;
            }
            //�ж��˺������Ƿ���ȷ
            if (isAccountCorrect(account, username, password)) {//��ȷ
                System.out.println("��¼�ɹ�������");
                System.out.println("��ӭ��������Ա");
                break;
            } else {
                if (i == 0) {
                    System.out.println("��¼���������꣬���Ժ����ԣ�");
                    return;
                } else {
                    System.out.println("�˺Ż�����������������룡��ʣ" + i + "�λ���");
                    continue;
                }
            }

        }
        //����ѧ������ϵͳ
        StudentSystem ss = new StudentSystem();
        ss.startStudentSystem();

    }

    //��֤������
    public static String createVerificationCode() {
        char[] verificationCode = new char[5];
        Random r = new Random();
        //��������
        int number = r.nextInt(9) + 1;//0~8+1=1~9
        //int->char
        char numberChar = (char) ('0' + number);
        //��������
        int index = r.nextInt(5);
        verificationCode[index] = numberChar;
        //�����ĸ������
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(52) + 1;//0~51+1=1~52
            char c = num > 26 ? (char) ('A' + num - 26-1) : (char) ('a' + num-1);
            if (verificationCode[i] != 0)
                continue;
            else verificationCode[i] = c;
        }
        return new String(verificationCode);
    }

    //��֤�����ɷ���
    public static String getCode() {
        //��52����ĸ����ӽ�����
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        //����StringBuilder
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

    //�˺�������֤
    public static boolean isAccountCorrect(ArrayList<User> account, String username, String password) {
        for (int i = 0; i < account.size(); i++) {
            if (account.get(i).getUsername().equals(username)
                    && account.get(i).getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    //��������
    public static void forgetPassword(ArrayList<User> account) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�����������û���");
        String username = sc.next();
        //�ж��˻��Ƿ�ע��
        if (!isContainsUsername(account, username)) {//�˻�������
            System.out.println("���˻�δע�ᣡ");
            return;
        }
        System.out.println("�����������ֻ��ţ�");
        String phoneNumber = sc.next();
        System.out.println("�������������֤�ţ�");
        String idCardNumber = sc.next();
        //��ȡ�û�����
        int index = 0;
        for (int i = 0; i < account.size(); i++) {//��������
            if (account.get(i).getUsername().equals(username))
                index = i;
            else index = -1;
        }
        //��֤��Ϣ
        if (isIdentityRight(account, index, username, phoneNumber, idCardNumber)) {//��֤ͨ��
            System.out.println("�����֤ͨ����");
        } else {
            System.out.println("�����Ϣ����");
            return;
        }
        //�޸�����
        while (true) {
            System.out.println("�����������룺");
            String newPassword = sc.next();
            System.out.println("���ٴ���������");
            String againNewPassword = sc.next();
            if (newPassword.equals(againNewPassword)) {
                System.out.println("�����޸ĳɹ���");
                account.get(index).setPassword(newPassword);
                return;
            } else {
                System.out.println("�����޸�ʧ�ܣ����������룡");
            }
        }

    }

    //���֤�����ֻ���ƥ���û�����֤
    public static boolean isIdentityRight(ArrayList<User> account, int index, String userName, String phoneNumber, String idCardNumber) {
        User u = account.get(index);
        //���û����֤�ź��ֻ�����ͬʱ
        if (u.getPhoneNumber().equals(phoneNumber) && u.getPersonID().equals(idCardNumber))
            return true;
        else return false;
    }
}