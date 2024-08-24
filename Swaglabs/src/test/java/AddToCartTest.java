import loginTests.BaseTest;
import org.example.pages.AddToCartPage;
import org.example.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddToCartTest extends BaseTest {

    @Test

    public void successfulProductPurchase() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        Assertions.assertTrue(driver.getPageSource().contains("Products"));

        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.addItemToCart();
        addToCartPage.clickOnShoppingCartSymbol();

        Assertions.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));

        addToCartPage.clickOnCheckoutButton();
        addToCartPage.enterFirstName("Jelena");
        addToCartPage.enterLastName("Jovi");
        addToCartPage.enterPostalCode("11000");
        addToCartPage.clickOnContinueButton();
        addToCartPage.clickOnFinishButton();
        addToCartPage.waitForConfirmationMessageToContain("Thank you for your order!");


    }


}
