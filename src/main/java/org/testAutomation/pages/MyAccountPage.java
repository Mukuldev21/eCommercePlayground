package org.testAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {

    //locators
    @FindBy(xpath = "//a[contains(text(), ' Edit your account information')]")
    private WebElement EditYourAccountInfoButton;

    @FindBy(xpath = "//a[contains(text(), 'Change your password')]")
    private WebElement ChangeYourPasswordButton;

    @FindBy(xpath = "//a[contains(text(), ' Modify your address book entries')]")
    private WebElement ModifyYourAddressBookButton;

    @FindBy(xpath = "//a[contains(text(), ' Modify your wish list')]")
    private WebElement ModifyYourWishListButton;

    @FindBy(xpath = "//a[contains(text(), 'Subscribe / unsubscribe to newsletter')]")
    private WebElement SubscribeNewsletterButton;

    @FindBy(xpath = "//a[contains(text(), ' View your order history')]")
    private WebElement ViewYourOrderHistoryButton;

    @FindBy(xpath = "(//a[contains(text(), 'Downloads')])[1]")
    private WebElement DownloadsButtonUnderMyOrders;

    @FindBy(xpath = "//a[contains(text(), 'Your Reward Points')]")
    private WebElement YourRewardPointsButton;

    @FindBy(xpath = "//a[contains(text(), ' View your return requests')]")
    private WebElement ViewYourReturnRequestsButton;

    @FindBy(xpath = "//a[contains(text(),'Your Transactions')]")
    private WebElement YourTransactionsButton;

    @FindBy(xpath = "(//a[contains(text(), 'Recurring payments')])[1]")
    private WebElement RecurringPaymentsButtonUnderMyOrders;

    @FindBy(xpath = "//a[contains(text(), ' Register for an affiliate account')]")
    private WebElement RegisterForAnAffiliateAccountButton;


    //Locators for Edit Your Account Information Page
    @FindBy(xpath = "//h1[contains(text(), 'My Account Information')]")
    private WebElement MyAccountInformationPageHeader;

    @FindBy(xpath = "//div[contains(text(), ' Success: Your account has been successfully updated.')]")
    private WebElement SuccessMessage;

    @FindBy(xpath = "//input[contains(@id, 'input-firstname')]")
    private WebElement FirstNameInputOnYourAccountInfoPage;

    @FindBy(xpath = "//input[contains(@id, 'input-lastname')]")
    private WebElement LastNameInputOnYourAccountInfoPage;

    @FindBy(xpath = "//input[contains(@id, 'input-email')]")
    private WebElement EmailInputOnYourAccountInfoPage;

    @FindBy(xpath = "//input[contains(@id, 'input-telephone')]")
    private WebElement TelephoneInputOnYourAccountInfoPage;

    @FindBy(xpath = "//small[contains(text(), 'Enter valid phone number with country code!')]")
    private WebElement TelephoneMessageOnYourAccountInfoPage;

    @FindBy(xpath = "//input[contains(@value,'Continue')]")
    private WebElement ContinueButtonOnYourAccountInfoPage;

    @FindBy(xpath = "//a[contains(text(), 'Back')]")
    private WebElement BackButtonOnYourAccountInfoPage;


    //Locators for Edit Change Your Password Page
    @FindBy(xpath = "//h1[contains(text(), 'Change Password')]")
    private WebElement ChangePasswordHeader;

    @FindBy(xpath = "//input[contains(@id, 'input-password')]")
    private WebElement PasswordInputOnChangeYourPasswordPage;

    @FindBy(xpath = "//input[contains(@id, 'input-confirm')]")
    private WebElement PasswordConfirmOnChangeYourPasswordPage;

    @FindBy(xpath = "//div[contains(text(), 'Password confirmation does not match password!')]")
    private WebElement PasswordErrorMessageOnChangeYourPasswordPage;

    @FindBy(xpath = "//input[contains(@value,'Continue')]")
    private WebElement ContinueButtonOnChangeYourPasswordPage;

    @FindBy(xpath = "//a[contains(text(), 'Back')]")
    private WebElement BackButtonOnChangeYourPasswordPage;


    //Locators for Modify your address book entries
    @FindBy(xpath = "//h1[contains(text(), 'Address Book Entries')]")
    private WebElement AddressBookEntriesHeader;

    @FindBy(xpath = "//a[contains(text(), 'New Address')]")
    private WebElement NewAddressButton;






}
