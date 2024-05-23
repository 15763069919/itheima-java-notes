package practise.Extends.带有继承的标准JavaBean类;

public class Test {
    public static void main(String[] args) {
        //创教经理对象
        Manager m = new Manager("001","张三",10000,5000);
        System.out.println(m.getId()+","+m.getName()+","+m.getSalary()+","+m.getBonus());
        m.work();
        m.eat();

        //创建厨师对象
        Cook c = new Cook();
        c.setId("002");
        c.setName("李四");
        c.setSalary(5000);
        System.out.println(c.getId()+","+c.getName()+","+c.getSalary());
        c.work();
        c.eat();
    }
}
//正常写
class Person {
    private String id;
    private String name;
    private int salary;

    public void work(){
        System.out.println("员工工作");
    }
    public void eat(){
        System.out.println("员工吃饭");
    }
    public Person() {
    }

    public Person(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Person{id = " + id + ", name = " + name + ", salary = " + salary + "}";
    }
}
//调用父类的构造方法
class Manager extends Person{
    private int bonus;

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
    public Manager() {
    }
    public Manager(String id,String name,int Salary,int bonus){
        //调用父类的有参构造，先对父类的属性进行初始化
        super(id,name,Salary);
        //再对子类的属性进行初始化
        this.bonus = bonus;
    }

    //只需要对子类的属性进行set和get方法的封装
    //不需要对父类的属性进行封装
    //因为父类的属性已经被封装了
    //子类可以直接调用父类的set和get方法
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
class Cook extends Person{
    public Cook() {
    }

    public Cook(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("做饭");
    }
}