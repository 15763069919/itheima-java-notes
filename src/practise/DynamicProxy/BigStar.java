package practise.DynamicProxy;

public class BigStar implements Star{
    private String name;

    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    //����
    @Override
    public String sing(String name){
        System.out.println(this.name +"���ڳ�"+name);
        return "лл";
    }

    //����
    @Override
    public void dance(){
        System.out.println(this.name +"��������");
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

    public String toString() {
        return "BigStar{name = " + name + "}";
    }
}
