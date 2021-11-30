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
        for (Product product : basketList) {
                if (isProductAlreadyInTheBasket(productName, product)) {
                    product.setQuantity(product.getQuantity() + productQuantity);
                    product.setTotalProductPrice(product.getPrice().multiply(BigDecimal.valueOf(product.getQuantity())));
                    return;
                }
            }
                addNewProductToBasketList(productName, productPrice, productQuantity);
            }

    private boolean isProductAlreadyInTheBasket(String productName, Product product) {
        return productName.equals(product.getName());
    }

    private void addNewProductToBasketList(String productName, BigDecimal productPrice, int productQuantity) {
        Product newProduct = new Product(productName, productPrice, productQuantity);
        basketList.add(newProduct);
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


