package pay.Object;

public class Cart {
    public int quantity;
    public int id;

    public Cart(int quantity, int id) {
        this.quantity = quantity;
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }
}
