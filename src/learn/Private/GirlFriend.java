package learn.Private;


public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    //name
    //���ã���name��Ա������ֵ
    public void setName(String n){
        name=n;
    }
    //���ã������ṩname���Ե�
    public String getName(){
        return name;
    }

    //age
    public void setAge(int a){
        if(a>=18&&a<=50)
            age=a;
        else
            System.out.println("�Ƿ�����");
    }
    public int getAge(){
        return age;
    }

    //gender
    public void setGender(String g){
        gender=g;
    }
    public String getGender(){
        return gender;
    }








    //��Ϊ
    public void sleep(){
        System.out.println("Ů����Ҫ˯��");
    }
    public void eat(){
        System.out.println("Ů����Ҫ�Է�");
    }
}
