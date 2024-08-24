package loginTests;

import org.example.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageTests extends BaseTest{

    @Test
    public void successfulLogInTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        Assertions.assertTrue(driver.getPageSource().contains("Products"));

    }

    @Test
    public void userCannotLoginWithInvalidCredentialsTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("moja_kupovina");
        loginPage.enterPassword("blackberry");
        loginPage.clickOnLoginButton();
        loginPage.waitForErrorMessageToContain("Epic sadface: Username and password do not match any user in this service");

    }

    @Test
    public void userCannotLoginWithoutInsertedPasswordTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("");
        loginPage.clickOnLoginButton();
        loginPage.waitForErrorMessageToContain("Epic sadface: Password is required");

    }
}
