package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartPage extends BasePage {

    @FindBy (css = "#header_container > div.header_secondary_container > span")
    private WebElement productsTitle;

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    private WebElement firstItemInTheCartName;

    @FindBy (css = "#shopping_cart_container > a")
    private WebElement shoppingCartSymbol;

    @FindBy (css = "#header_container > div.header_secondary_container > span")
    private WebElement yourCartTitle;

    @FindBy (css = "[data-test='inventory-item-name']")
    private WebElement shoppingItemName;

    @FindBy (css= "#checkout")
    private WebElement checkoutButton;

    @FindBy (css = "#header_container > div.header_secondary_container > span")
    private WebElement checkoutYourInformationTitle;

    @FindBy (css = "#first-name")
    private  WebElement firstNameInsert;

    @FindBy (css = "#last-name")
    private WebElement lastNameInsert;

    @FindBy (css = "#postal-code")
    private WebElement postalCodeInsert;

    @FindBy (css = "#continue")
    private WebElement continueButton;

    @FindBy (css = "#header_container > div.header_secondary_container > span")
    private WebElement checkoutOverviewTitle;

    @FindBy (css = "#finish")
    private WebElement finishButton;

    @FindBy (css = "#checkout_complete_container > h2")
    private WebElement confirmationMessageLabel;



    public AddToCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addItemToCart () {
        waitForElementToBeVisible(productsTitle);
        wait.until(ExpectedConditions.elementToBeClickable(firstItemInTheCartName));
       click(firstItemInTheCartName);
    }

    public void clickOnShoppingCartSymbol() {
        waitForElementToBeVisible(shoppingCartSymbol);
        click(shoppingCartSymbol);
    }

    public void clickOnCheckoutButton() {
        waitForElementToBeVisible(yourCartTitle);
        waitForElementToBeVisible(shoppingItemName);
        click(checkoutButton);
    }

    public void enterFirstName (String firstName) {
        waitForElementToBeVisible(checkoutYourInformationTitle);
        enterText(firstNameInsert, firstName);
    }

    public void enterLastName (String lastName) {
        enterText(lastNameInsert, lastName);
    }

    public void enterPostalCode (String postalCode) {
        enterText (postalCodeInsert, postalCode);
    }

    public void clickOnContinueButton() {
        click(continueButton);
    }

    public void clickOnFinishButton() {
        waitForElementToBeVisible(checkoutOverviewTitle);
        wait.until(ExpectedConditions.elementToBeClickable(finishButton));
        click(finishButton);
    }

    public void waitForConfirmationMessageToContain (String confirmationMessage) {
        wait.until(ExpectedConditions.textToBePresentInElement(confirmationMessageLabel, confirmationMessage));
    }
}

