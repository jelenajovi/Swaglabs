package loginTests;

import org.example.pages.LoginPage;
import org.example.pages.SocialMediaPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URL;

public class SocialMediaPageTests extends  BaseTest{

    @Test

    public void successfulTwitterLinkOpening () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        Assertions.assertTrue(driver.getPageSource().contains("Products"));

        SocialMediaPage socialMediaPage = new SocialMediaPage(driver);
        socialMediaPage.clickOnTwitterSymbol();

    }

    @Test

    public void successfulFacebookLinkOpening () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        Assertions.assertTrue(driver.getPageSource().contains("Products"));

        SocialMediaPage socialMediaPage = new SocialMediaPage(driver);
        socialMediaPage.clickOnFacebookSymbol();
    }

    @Test

    public void successfulLinkedinLinkOpening () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        Assertions.assertTrue(driver.getPageSource().contains("Products"));

        SocialMediaPage socialMediaPage = new SocialMediaPage(driver);
        socialMediaPage.clickOnLinkedinSymbol();
    }



}
