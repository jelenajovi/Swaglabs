package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private static final String usernameInputCssLocator = "[data-test='username']";
    private static final String passwordInputCssLocator = "[data-test='password']";
    private static final String loginButtonInputCssLocator = "[data-test='login-button']";
    private static final String productsTitleInputCssLocator = "[data-test='title']";
    private static final String errorMessageCssLocator = "[data-test='error']";

    @FindBy(css = usernameInputCssLocator)
    private WebElement usernameInput;

    @FindBy(css = passwordInputCssLocator)
    private WebElement passwordInput;

    @FindBy(css = loginButtonInputCssLocator)
    private WebElement loginButton;

    @FindBy(css=productsTitleInputCssLocator)
    private WebElement productsTitle;

    @FindBy(css=errorMessageCssLocator)
    private WebElement errorMessageLabel;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void enterUsername (String username) {
        enterText(usernameInput, username);
    }

    public void enterPassword (String pass) {
        enterText (passwordInput,pass);
    }

    public void clickOnLoginButton () {
        click(loginButton);
    }


    public void waitForErrorMessageToContain (String errorMessage) {
        wait.until(ExpectedConditions.textToBePresentInElement(errorMessageLabel, errorMessage));
    }



}
