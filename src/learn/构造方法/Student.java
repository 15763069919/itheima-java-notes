package learn.���췽��;

public class Student {
    private String name;
    private int age;

    //��������Լ�û��д�κεĹ��췽��
    //��ô����������Ǽ�һ���ղι��췽��
    //����(�ղι���)
    public Student(){
        System.out.println("������ִ������");
    }
    //���ι���
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }



    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
