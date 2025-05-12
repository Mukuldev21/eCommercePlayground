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

    @FindBy(xpath = "//input[contains(@id, 'input-firstname')]")
    private WebElement FirstNameInputOnAddressBookPage;

    @FindBy(xpath = "//input[contains(@id, 'input-lastname')]")
    private WebElement LastNameInputOnAddressBookPage;

    @FindBy(xpath = "//input[contains(@id, 'input-company')]")
    private WebElement CompanyInputOnAddressBookPage;

    @FindBy(xpath = "//input[contains(@id, 'input-address-1')]")
    private WebElement Address1InputOnAddressBookPage;

    @FindBy(xpath = "//input[contains(@id, 'input-address-2')]")
    private WebElement Address2InputOnAddressBookPage;

    @FindBy(xpath = "//input[contains(@id, 'input-city')]")
    private WebElement CityInputOnAddressBookPage;

    @FindBy(xpath = "//input[contains(@id, 'input-postcode')]")
    private WebElement PostCodeOnAddressBookPage;

    @FindBy(xpath = "//select[contains(@id, 'input-country')]")
    private WebElement CountryInputOnAddressBookPage;

    @FindBy(xpath = "//select[contains(@id, 'input-zone')]")
    private WebElement RegionInputOnAddressBookPage;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    private WebElement DefaultAddressYesButton;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    private WebElement DefaultAddressNoButton;

    @FindBy(xpath = "//input[contains(@value,'Continue')]")
    private WebElement ContinueButtonOnAddressBookPage;

    @FindBy(xpath = "//a[contains(text(), 'Back')]")
    private WebElement BackButtonOnAddressBookPage;

    
    //Locators for Your Wish List
    @FindBy(xpath = "//h1[contains(text(), 'My Wish List')]")
    private WebElement MyWishListHeader;

    @FindBy(xpath = "//input[contains(@value,'Continue')]")
    private WebElement ContinueButtonOnMyListPage;


    //Locators for Newsletter Subscription
    @FindBy(xpath= "//h1[contains(text(), 'Newsletter Subscription')]")
    private WebElement NewsletterSubscriptionHeader;

    @FindBy(xpath = "//input[contains(@id, 'input-newsletter-yes')]")
    private WebElement SubscribeNewsletterYesButton;

    @FindBy(xpath = "//input[contains(@id, 'input-newsletter-no')]")
    private WebElement SubscribeNewsletterNoButton;

    @FindBy(xpath = "//input[contains(@value,'Continue')]")
    private WebElement ContinueButtonOnNewsletterSubscriptionPage;

    @FindBy(xpath = "//a[contains(text(), 'Back')]")
    private WebElement BackButtonOnNewsletterSubscriptionPage;


    //Locators for View your order history
    @FindBy(xpath = "//h1[contains(text(), 'Order History')]")
    private WebElement OrderHistoryHeader;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    private WebElement ContinueButtonOnOrderHistoryPage;


    //Locators for Downloads
    @FindBy(xpath = "//h1[contains(text(), 'Account Downloads')]")
    private WebElement AccountDownloadsHeader;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    private WebElement ContinueButtonOnOrderDownloadsPage;


    //Locators for Your Reward Points
    @FindBy(xpath = "//h1[contains(text(), 'Your Reward Points')]")
    private WebElement YourRewardPointsHeader;

    @FindBy(xpath = "//a[contains(text(), 'Continue')]")
    private WebElement ContinueButtonOnRewardPointsPage;










}
