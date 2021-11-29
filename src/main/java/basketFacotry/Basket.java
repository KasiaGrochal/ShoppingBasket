package basketFacotry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    public List<Product> basketList;

    public Basket() {
        basketList = new ArrayList<>();
    }

    public void addProductToBasket(String productName, BigDecimal productPrice, int productQuantity) {
        if (basketList.isEmpty()) {
            Product newProduct = new Product(productName, productPrice, productQuantity);
            basketList.add(newProduct);
        } else {
            boolean exists = false;
            for (Product product : basketList) {
                if (productName.equals(product.getName())) {
                    exists = true;
                    product.setQuantity(product.getQuantity() + productQuantity);
                    product.setTotalProductPrice(product.getPrice().multiply(BigDecimal.valueOf(product.getQuantity())));
                }
            }
            if (!exists) {
                Product newProduct = new Product(productName, productPrice, productQuantity);
                basketList.add(newProduct);
            }
        }
    }

    public List<Product> getBasketList() {
        return basketList;
    }

    public BigDecimal getBasketTotalCost() {
        BigDecimal sum = BigDecimal.valueOf(0);
        for (Product product : basketList) {
            sum = sum.add(product.getTotalProductPrice());
        }
        return sum;
    }
}


