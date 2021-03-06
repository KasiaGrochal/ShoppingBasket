import basketFacotry.Basket;
import helpers.PrintToUserInfo;
import helpers.UserInputHelper;

public class Main {

    public static void main(String[] args) {
        Basket myBasket = new Basket();

        for (int i = 0; i < 5; i++) {
            myBasket.addProductToBasket(UserInputHelper.getProductName(), UserInputHelper.getProductPrice(), UserInputHelper.getQuantity());
        }

        PrintToUserInfo.printBasketItems(myBasket.getBasketList());
        PrintToUserInfo.printTotalBasketCost(myBasket);
    }
}
