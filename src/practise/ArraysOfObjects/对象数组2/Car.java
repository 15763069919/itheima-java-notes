package practise.ArraysOfObjects.��������2;

public class Car {
    private String brand;//Ʒ��
    private int price;//�۸�
    private String color;//��ɫ


    public Car() {
    }

    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    /**
     * ��ȡ
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * ����
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * ��ȡ
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * ����
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * ��ȡ
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * ����
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Car{brand = " + brand + ", price = " + price + ", color = " + color + "}";
    }
}
