package org.testAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    //Locators

    @FindBy(xpath = "(//span[contains(text(), 'My account')])[2]")
    private WebElement MyAccountButton;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    private WebElement ContinueButton;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement RegisterButton;

   @FindBy(xpath = "(//a[contains(text(),'Forgotten Password')])[2]")
    private WebElement ForgottenPasswordButtonOnSideMenu;

   @FindBy(xpath= "//a[contains(text(),'My Account')]")
    private WebElement MyAccountButtonOnSideMenu;

   @FindBy(xpath = "//a[contains(text(),'Address Book')]")
    private WebElement AddressBookButton;

   @FindBy(xpath = "//a[contains(text(),'Wish List')]")
    private WebElement WishListButton;

   @FindBy(xpath = "//a[contains(text(),'Order History')]")
    private WebElement OrderHistoryButton;

   @FindBy(xpath = "//a[contains(text(),'Downloads')]")
    private WebElement DownloadsButton;

   @FindBy(xpath = "//a[contains(text(),'Recurring payments')]")
    private WebElement RecurringpaymentsButton;

   @FindBy(xpath = "//a[contains(text(),'Reward Points')]")
    private WebElement RewardPointsButton;

   @FindBy(xpath = "//a[contains(text(),'Returns')]")
    private WebElement ReturnsButton;

   @FindBy(xpath = "//a[contains(text(),'Transactions')]")
    private WebElement TransactionsButton;

   @FindBy(xpath = "//input[contains(@id,'input-email')]")
    private WebElement EmailInput;

   @FindBy(xpath = "//input[contains(@id,'input-password')]")
    private WebElement PasswordInput;

   @FindBy(xpath = "//input[contains(@value, 'Login')]")
    private  WebElement LoginButton;



}
