import java.util.List;

public class PrintToUserInfo {

    public static void askForProductName(){
        System.out.println("Please type in the name of the product: ");
    }
    public static void askForProductPrice(){
        System.out.println("Please type in the price of the product: ");
    }
    public static void askForProductQuantity(){
        System.out.println("Please type in the quantity: ");
    }
    public static void printTotalBasketCost(Basket basket){
        System.out.println("\tBasket total cost is: "+basket.getBasketTotalCost());
    }
    public static void printBasketItems(List<Product> basketList) {
        for (Product product : basketList) {
            System.out.println("\t"+product.toString());
        }
    }
}
