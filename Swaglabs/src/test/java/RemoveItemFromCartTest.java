import loginTests.BaseTest;
import org.example.pages.AddToCartPage;
import org.example.pages.LoginPage;
import org.example.pages.RemoveItemFromCartPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveItemFromCartTest extends BaseTest {

    @Test

    public void successfulRemoveItemFromCart() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        Assertions.assertTrue(driver.getPageSource().contains("Products"));

        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.addItemToCart();
        addToCartPage.clickOnShoppingCartSymbol();

        Assertions.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));

        RemoveItemFromCartPage removeItemFromCartPage = new RemoveItemFromCartPage(driver);
        removeItemFromCartPage.clickOnRemoveButton();
        removeItemFromCartPage.clickOnContinueShoppingButton();

        Assertions.assertTrue(driver.getPageSource().contains("Products"));

        removeItemFromCartPage.waitForNumberOfAllAddToCartButtonsToBe(6);


    }
}
