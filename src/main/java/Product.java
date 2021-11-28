

public class Product {
    String name;
    int price;
    int quantity;
    int totalPrice;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice= this.price*this.quantity;

    }
    @Override
    public String toString(){
        return "Product: " + name+
                ", Price: " + price+
                ", Quantity: " + quantity+
                ", Total price: "+ totalPrice;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}


