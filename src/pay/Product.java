package pay;

public class Product {
    public String name;
    public int price;
    public String desc;
    public int point;
    public int id;

    public Product(String name, int price, String desc, int point, int id) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.point = point;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public int getPoint() {
        return point;
    }

    public int getId() {
        return id;
    }
}
