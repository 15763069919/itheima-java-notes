package practise.ArraysOfObjects.��������3;

public class Phone {
    private String brand;
    private int price;
    private String color;


    public Phone() {
    }

    public Phone(String brand, int price, String color) {
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
        return "Phone{brand = " + brand + ", price = " + price + ", color = " + color + "}";
    }
}
