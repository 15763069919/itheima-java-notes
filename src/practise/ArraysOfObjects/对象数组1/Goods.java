package practise.ArraysOfObjects.��������1;

public class Goods {
    private String id;//��ǩ
    private String name;//����
    private double price;//�۸�
    private int count;//���


    public Goods() {
    }

    public Goods(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
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
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * ����
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * ��ȡ
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * ����
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        return "Goods{id = " + id + ", name = " + name + ", price = " + price + ", count = " + count + "}";
    }
}
