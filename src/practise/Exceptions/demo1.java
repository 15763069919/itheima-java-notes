package practise.Exceptions;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GirlFrieng gf1 = new GirlFrieng();

        while (true) {
            try {
                gf1.setName(sc.nextLine());
                gf1.setAge(Integer.parseInt(sc.nextLine()));
                //若果所有数据都是正确的，跳出循环
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请输入数字");
//                continue;
            } catch (RuntimeException e) {//父类写在下面
                System.out.println("姓名的长度或年龄的范围有误");
//                continue;
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
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name)/*throws RuntimeException*/ {
        if (name.length() < 3 || name.length() > 10) {
            throw new RuntimeException();
        }
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age)/*throws RuntimeException*/ {
        if (age < 18 || age > 40) {
            throw new RuntimeException();
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFrieng{name = " + name + ", age = " + age + "}";
    }
}