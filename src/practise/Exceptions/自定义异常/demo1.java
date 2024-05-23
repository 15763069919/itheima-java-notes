package practise.Exceptions.自定义异常;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GirlFrieng gf1 = new GirlFrieng();

        while (true) {
            try {
                System.out.println("姓名");
                gf1.setName(sc.nextLine());
                System.out.println("年龄");
                gf1.setAge(Integer.parseInt(sc.nextLine()));
                //若果所有数据都是正确的，跳出循环
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (NameFormatException e) {//父类写在下面
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {//父类写在下面
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
            throw new NameFormatException(name + "格式有误，长度应该为3-10");
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
            throw new AgeOutOfBoundsException(age + "超出了范围");
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFrieng{name = " + name + ", age = " + age + "}";
    }
}