package practise.Extends.���м̳еı�׼JavaBean��;

public class Test {
    public static void main(String[] args) {
        //���̾������
        Manager m = new Manager("001","����",10000,5000);
        System.out.println(m.getId()+","+m.getName()+","+m.getSalary()+","+m.getBonus());
        m.work();
        m.eat();

        //������ʦ����
        Cook c = new Cook();
        c.setId("002");
        c.setName("����");
        c.setSalary(5000);
        System.out.println(c.getId()+","+c.getName()+","+c.getSalary());
        c.work();
        c.eat();
    }
}
//����д
class Person {
    private String id;
    private String name;
    private int salary;

    public void work(){
        System.out.println("Ա������");
    }
    public void eat(){
        System.out.println("Ա���Է�");
    }
    public Person() {
    }

    public Person(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * ��ȡ
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * ����
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡ
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * ����
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Person{id = " + id + ", name = " + name + ", salary = " + salary + "}";
    }
}
//���ø���Ĺ��췽��
class Manager extends Person{
    private int bonus;

    @Override
    public void work() {
        System.out.println("����������");
    }
    public Manager() {
    }
    public Manager(String id,String name,int Salary,int bonus){
        //���ø�����вι��죬�ȶԸ�������Խ��г�ʼ��
        super(id,name,Salary);
        //�ٶ���������Խ��г�ʼ��
        this.bonus = bonus;
    }

    //ֻ��Ҫ����������Խ���set��get�����ķ�װ
    //����Ҫ�Ը�������Խ��з�װ
    //��Ϊ����������Ѿ�����װ��
    //�������ֱ�ӵ��ø����set��get����
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
        System.out.println("����");
    }
}