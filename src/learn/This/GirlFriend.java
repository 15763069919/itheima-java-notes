package learn.This;


public class GirlFriend {
    private String name;//��Ա����
    private int age;
    private String gender;

    //name
    //���ã���name��Ա������ֵ
    public void setName(String name) {//�ֲ�����
        //=��ߣ���Ա����name��=�ұߣ��ֲ�����name�������ͽ�ԭ��
        this.name = name;
    }

    //���ã������ṩname���Ե�
    public String getName() {
        return name;
    }

    //age
    public void setAge(int age) {
        if (age >= 18 && age <= 50)
            this.age = age;
        else
            System.out.println("�Ƿ�����");
    }

    public int getAge() {
        return age;
    }

    //gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }


    //��Ϊ
    public void sleep() {
        System.out.println("Ů����Ҫ˯��");
    }

    public void eat() {
        System.out.println("Ů����Ҫ�Է�");
    }
}
