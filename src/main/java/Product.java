import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    String name;
    BigDecimal price;
    int quantity;
    BigDecimal totalProductPrice;

    public Product(String name, BigDecimal price, int quantity) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(price));
        this.name = name;
        this.price = bigDecimal.setScale(2,RoundingMode.HALF_UP);
        this.quantity = quantity;
        this.totalProductPrice = this.price.multiply(BigDecimal.valueOf(quantity));

    }
    @Override
    public String toString(){
        return "Product: " + name+
                ", Price: " + price+
                ", Quantity: " + quantity+
                ", Total price: "+ totalProductPrice;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getTotalProductPrice() {
        return totalProductPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalProductPrice(BigDecimal totalProductPrice) {
        this.totalProductPrice = totalProductPrice;
    }
}


