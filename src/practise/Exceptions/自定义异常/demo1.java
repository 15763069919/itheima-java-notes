package practise.Exceptions.�Զ����쳣;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GirlFrieng gf1 = new GirlFrieng();

        while (true) {
            try {
                System.out.println("����");
                gf1.setName(sc.nextLine());
                System.out.println("����");
                gf1.setAge(Integer.parseInt(sc.nextLine()));
                //�����������ݶ�����ȷ�ģ�����ѭ��
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (NameFormatException e) {//����д������
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {//����д������
                e.printStackTrace();
            }
        }


        System.out.println(gf1);

    }
}


class GirlFrieng {
    private String name;
    private int age;

    public GirlFrieng() {
    }

    public GirlFrieng(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * ��ȡ
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     *
     * @param name
     */
    public void setName(String name)/*throws RuntimeException*/ {
        if (name.length() < 3 || name.length() > 10) {
            throw new NameFormatException(name + "��ʽ���󣬳���Ӧ��Ϊ3-10");
        }
        this.name = name;
    }

    /**
     * ��ȡ
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * ����
     *
     * @param age
     */
    public void setAge(int age)/*throws RuntimeException*/ {
        if (age < 18 || age > 40) {
            throw new AgeOutOfBoundsException(age + "�����˷�Χ");
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFrieng{name = " + name + ", age = " + age + "}";
    }
}