package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SocialMediaPage extends BasePage{

    @FindBy(css = "#header_container > div.header_secondary_container > span")
    private WebElement productsTitle;

    @FindBy (css= "[data-test='social-twitter']")
    private WebElement twitterSymbol;

    @FindBy (css = "[data-test='social-facebook']")
    private WebElement facebookSymbol;

    @FindBy (css = "[data-test='social-linkedin']")
    private WebElement linkedinSymbol;




    public SocialMediaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnTwitterSymbol () {
        waitForElementToBeVisible(productsTitle);
        wait.until(ExpectedConditions.elementToBeClickable(twitterSymbol));
        click(twitterSymbol);
    }

    public void clickOnFacebookSymbol () {
        waitForElementToBeVisible(productsTitle);
        wait.until(ExpectedConditions.elementToBeClickable(facebookSymbol));
        click(facebookSymbol);
    }

    public void clickOnLinkedinSymbol () {
        waitForElementToBeVisible(productsTitle);
        wait.until(ExpectedConditions.elementToBeClickable(linkedinSymbol));
        click(linkedinSymbol);
    }



}
