package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RemoveItemFromCartPage extends BasePage {


    @FindBy (css = "#header_container > div.header_secondary_container > span")
    private WebElement yourCartTitle;

    @FindBy (css="#remove-sauce-labs-backpack")
    private WebElement removeItemButton;

    @FindBy (css="#continue-shopping")
    private WebElement continueShoppingButton;


    public RemoveItemFromCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void clickOnRemoveButton() {
        waitForElementToBeVisible(yourCartTitle);
        wait.until(ExpectedConditions.elementToBeClickable(removeItemButton));
        click(removeItemButton);
    }

    public void clickOnContinueShoppingButton() {
        waitForElementToBeVisible(yourCartTitle);
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton));
        click(continueShoppingButton);
    }

    public void waitForNumberOfAllAddToCartButtonsToBe(Integer expectedNumber) {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("button.btn.btn_primary.btn_small.btn_inventory"), expectedNumber));
    }


}
