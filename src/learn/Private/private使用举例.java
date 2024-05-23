package learn.Private;

public class private使用举例 {
    private int age;

    //set 赋值
    public void setAge(int a) {
        if (a >= 18 && a <= 50) {
            age = a;
        } else {
            System.out.println("非法数据");
        }
    }

    //get 获取
    public int getAge() {
        return age;
    }
}
