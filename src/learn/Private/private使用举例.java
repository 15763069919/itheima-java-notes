package learn.Private;

public class privateʹ�þ��� {
    private int age;

    //set ��ֵ
    public void setAge(int a) {
        if (a >= 18 && a <= 50) {
            age = a;
        } else {
            System.out.println("�Ƿ�����");
        }
    }

    //get ��ȡ
    public int getAge() {
        return age;
    }
}
