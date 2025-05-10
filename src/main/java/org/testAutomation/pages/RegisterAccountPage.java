package org.testAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountPage {

    //Locators
    @FindBy(xpath = "//input[contains(@id, 'input-firstname')]")
    private WebElement FirstNameInput;

    @FindBy(xpath = "//input[contains(@id, 'input-lastname')]")
    private WebElement LastNameInput;

    @FindBy(xpath = "//input[contains(@id, 'input-email')]")
    private WebElement EmailInput;

    @FindBy(xpath = "//input[contains(@id, 'input-telephone')]")
    private WebElement TelephoneInput;

    @FindBy(xpath = "//small[contains(text(), 'Enter valid phone number with country code!')]")
    private WebElement TelephoneMessage;

    @FindBy(xpath = "//input[contains(@id, 'input-password')]")
    private WebElement PasswordInputOnRegisterAccount;

    @FindBy(xpath = "//input[contains(@id, 'input-confirm')]")
    private WebElement ConfirmPasswordInput;

    @FindBy(xpath = "//input[contains(@id, 'input-newsletter-yes')]")
    private WebElement NewsletterYesButton;

    @FindBy(xpath = "//input[contains(@id, 'input-newsletter-no')]")
    private WebElement NewsletterNoButton;

    @FindBy(xpath = "//input[contains(@id, 'input-agree')]")
    private WebElement AgreeCheckbox;

    @FindBy(xpath = "//b[contains(text(), 'Privacy Policy')]")
    private WebElement PrivacyPolicyLink;

    @FindBy(xpath = "//h4[contains(text(), 'Privacy Policy')]")
    private WebElement PrivacyPolicyPopUpTitle;

    @FindBy(xpath = "//p[contains(text(), 'Privacy Policy')]")
    private WebElement PrivacyPolicyPopUpBody;

    @FindBy(xpath = "//button[@class='close' and @data-dismiss='modal']")
    private WebElement CloseButtonOnPopup;

    @FindBy(xpath = "//input[@value='Continue' and @type='submit']")
    private WebElement ContinueButton;

    //locators for Warnings
    @FindBy(xpath = "//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
    private WebElement FirstNameErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
    private WebElement LastNameErrorMessage;

    @FindBy(xpath = "//div[contains(text(), 'E-Mail Address does not appear to be valid!')]")
    private WebElement EmailErrorMessage;

    @FindBy(xpath = "//div[contains(text(), 'Telephone must be between 3 and 32 characters!')]")
    private WebElement TelephoneErrorMessage;

    @FindBy(xpath = "//small[contains(@id, 'input-telephone-help')]")
    private WebElement TelephoneHelpMessage;

    @FindBy(xpath = "//div[contains(text(),'Password must be between 4 and 20 characters!')]")
    private WebElement PasswordErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'Password confirmation does not match password!')]")
    private WebElement PasswordConfirmationErrorMessage;

    @FindBy(xpath = "//div[contains(text(),' Warning: You must agree to the Privacy Policy!')]")
    private WebElement PrivacyPolicyErrorMessage;

    @FindBy(xpath = "//p[contains(text(), 'If you already have an account with us, please login at the ')]")
    private WebElement ErrorMessageRegisteredUser;

    @FindBy(xpath = "//div[contains(text(), ' Warning: E-Mail Address is already registered!')]")
    private WebElement UsedEmailErrorMessage;

    //Locators - Confirmation
    @FindBy(xpath = "//h1[contains(text(), ' Your Account Has Been Created!')]")
    private WebElement AccountConfirmationMessage;

    @FindBy(xpath = "//a[contains(text(), 'Continue')]")
    private WebElement ContinueButtonOnConfirmation;

    @FindBy(xpath = "//h2[contains(text(), 'My Account')]")
    private WebElement MyAccountHeader;


}
