package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[text()='Electronics ']")
    WebElement hoverOnElectronic;

    @CacheLookup
    @FindBy(xpath = "//ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement clickOnCellPhone;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Cell phones']")
    WebElement getCellPhoneText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewTab;

    @CacheLookup
    @FindBy(xpath = "//div[3]/div[1]/div[2]/h2[1]/a")
    WebElement nokiaLumia1020;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Nokia Lumia 1020']")
    WebElement getNokiaLumiaText;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement getPrice349;

    @CacheLookup
    @FindBy(name = "addtocart_20.EnteredQuantity")
    WebElement changeQuantity;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCartTab;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement getProductAddedInShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeButton;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping cart']")
    WebElement hoverOnShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement clickGoToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement getShoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    WebElement checkQuantityIs2;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement checkTotal698;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkbox;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement getWelcomeMessage;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Register']")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement checkRegisterText;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement gender;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement day;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement month;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement year;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement checkRegistrationText;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueTab;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement checkShoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='terms-of-service']")
    WebElement termsOfServices;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;


    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(xpath = "//div/button[4]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement on2ndDayAir;

    @CacheLookup
    @FindBy(xpath = "//form/div[2]/button[1]")
    WebElement clickContinue;

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardRadioButton;

    @CacheLookup
    @FindBy(xpath = "//li[4]/div[2]/div[1]/button[1]")
    WebElement clickCon;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement visa;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardholderName;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;

    @CacheLookup
    @FindBy(xpath = "//li[5]/div[2]/div[1]/button[1]")
    WebElement clickConBtn;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement checkCreditCardText;

    @CacheLookup
    @FindBy(xpath = "//div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement check2ndDayAirText;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement checkLastTotal;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement checkThankYouText;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfullyMessage;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnContinue;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeToOurStoreMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;



    public void mouseHoverOnElectronicTab() {
        Reporter.log("mouseHoverOnElectronicTab" + hoverOnElectronic.toString());
        mouseHoverToElement(hoverOnElectronic);
    }

    public void clickOnCellPhones() {
        Reporter.log("clickOnCellPhones" + clickOnCellPhone.toString());
        clickOnElement(clickOnCellPhone);
    }

    public String getCellPhoneText() {
        Reporter.log("getCellPhoneText" + getCellPhoneText.toString());
        return getTextFromElement(getCellPhoneText);
    }

    public void clickOnListViewTab() {
        Reporter.log("clickOnListViewTab" + listViewTab.toString());
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumiaProduct() {
        Reporter.log("clickOnNokiaLumiaProduct" + nokiaLumia1020.toString());
        clickOnElement(nokiaLumia1020);
    }

    public String verifyNokiaLumiaText() {
        Reporter.log("verifyNokiaLumiaText" + getNokiaLumiaText.toString());
        return getTextFromElement(getNokiaLumiaText);
    }

    public String verifyPrice349() {
        Reporter.log("verifyPrice349" + getPrice349.toString());
        return getTextFromElement(getPrice349);
    }

    public void changeTheQuantity() {
        Reporter.log("changeTheQuantity" + changeQuantity.toString());
        driver.findElement(By.name("addtocart_20.EnteredQuantity")).clear();
        sendTextToElement(changeQuantity, "2");
    }

    public void clickOnAddToCartButton() {
        Reporter.log("clickOnAddToCartButton" + addToCartTab.toString());
        clickOnElement(addToCartTab);
    }

    public String verifyProductAddedInShoppingCartText() {
        Reporter.log("verifyProductAddedInShoppingCartText" + getProductAddedInShoppingCart.toString());
        return getTextFromElement(getProductAddedInShoppingCart);
    }

    public void clickOnCloseButton() {
        Reporter.log("clickOnCloseButton" +closeButton.toString());
        clickOnElement(closeButton);
    }

    public void hoverOnShoppingCartAndClickOnGoToCartButton() {
        Reporter.log("hoverOnShoppingCartAndClickOnGoToCartButton" + clickGoToCart.toString());
        mouseHoverToElement(hoverOnShoppingCart);
        clickOnElement(clickGoToCart);
    }

    public String verifyShoppingCartText() {
        Reporter.log("verifyShoppingCartText" + getShoppingCartText.toString());
        return getTextFromElement(getShoppingCartText);
    }

    public String verifyTheQuantityIs2() {
        Reporter.log("verifyTheQuantityIs2" + checkQuantityIs2.toString());
        return getTextFromElement(checkQuantityIs2);
    }

    public String verifyTheTotal() {
        Reporter.log("verifyTheTotal" + checkTotal698.toString());
        return getTextFromElement(checkTotal698);
    }

    public void clickOnCheckBox() {
        Reporter.log("clickOnCheckBox" + checkbox.toString());
        clickOnElement(checkbox);
    }

    public void clickOnCheckoutButton() {
        Reporter.log("clickOnCheckoutButton" +checkout.toString());
        clickOnElement(checkout);
    }

    public String verifyWelcomeMessage() {
        Reporter.log("verifyWelcomeMessage" + getWelcomeMessage.toString());
        return getTextFromElement(getWelcomeMessage);
    }

    public void clickOnRegisterTab() {
        Reporter.log("clickOnRegisterTab" + register.toString());
        clickOnElement(register);
    }

    public String verifyRegisterText() {
        Reporter.log("verifyRegisterText" + checkRegisterText.toString());
        return getTextFromElement(checkRegisterText);
    }

    public void mandatoryFields() {
        Reporter.log("mandatoryFields" + gender.toString());
        clickOnElement(gender);
        sendTextToElement(firstName, "Adam");
        sendTextToElement(lastName, "smith");
        selectByVisibleTextFromDropDown(day, "22");
        selectByVisibleTextFromDropDown(month, "June");
        selectByVisibleTextFromDropDown(year, "1985");
        sendTextToElement(email, "Adam123" + getAlphaNumericString(3) + "@gmail.com");
        sendTextToElement(password, "Adam123456");
        sendTextToElement(confirmPassword, "Adam123456");
    }

    public void clickOnRegistrationButton() {
        Reporter.log("clickOnRegistrationButton" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyRegistrationText() {
        Reporter.log("verifyRegistrationText" + checkRegistrationText);
        return getTextFromElement(checkRegistrationText);
    }

    public void clickOnContinueTab() {
        Reporter.log("clickOnContinueTab" + continueTab.toString());
        clickOnElement(continueTab);
    }

    public String checkShoppingCartText() {
        Reporter.log("checkShoppingCartText" + checkShoppingCartText.toString());
        return getTextFromElement(checkShoppingCartText);
    }
    public void clickOnTermsAndServicesBox(){
        Reporter.log("clickOnTermsAndServicesBox" + termsOfServices.toString());
        clickOnElement(termsOfServices);
    }

    public void clickOnCheckoutLast(){
        Reporter.log("clickOnCheckoutLast" + clickOnCheckout.toString());
        clickOnElement(clickOnCheckout);
    }

    public void fillDeliveryAddressFields() {
        Reporter.log("fillDeliveryAddressFields" + country.toString());
        selectByVisibleTextFromDropDown(country, "United Kingdom");
        sendTextToElement(city, "London");
        sendTextToElement(address, "1, Charlie road");
        sendTextToElement(postCode, "HA5 7NN");
        sendTextToElement(phoneNumber, "1234567890");
    }

    public void clickOnContinueButton() {
        Reporter.log("clickOnContinueButton" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOn2ndDayAirButton() {
        Reporter.log("clickOn2ndDayAirButton" + on2ndDayAir.toString());
        clickOnElement(on2ndDayAir);
    }

    public void clickContinue() {
        Reporter.log("clickContinue" + clickContinue.toString());
        clickOnElement(clickContinue);
    }

    public void selectCreditCardRadioButton() {
        Reporter.log("selectCreditCardRadioButton" + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void clickCon() {
        Reporter.log("clickCon" + clickCon.toString());
        clickOnElement(clickCon);
    }

    public void selectVisaFromDropDown() {
        Reporter.log("selectVisaFromDropDown" + visa.toString());
        selectByVisibleTextFromDropDown(visa, "Visa");
    }

    public void fillCardDetails() {
        Reporter.log("fillCardDetails" + cardNumber.toString());
        sendTextToElement(cardholderName, "Adam Smith");
        sendTextToElement(cardNumber, "4222222222222");
        selectByVisibleTextFromDropDown(expireMonth, "05");
        selectByVisibleTextFromDropDown(expireYear, "2025");
        sendTextToElement(cardCode, "646");
    }

    public void clickConBtn() {
        Reporter.log("clickConBtn" + clickConBtn.toString());
        clickOnElement(clickConBtn);
    }

    public String verifyCreditCardText() {
        Reporter.log("verifyCreditCardText" + checkCreditCardText.toString());
        return getTextFromElement(checkCreditCardText);
    }

    public String verify2ndDayAirText() {
        Reporter.log("verify2ndDayAirText" + check2ndDayAirText.toString());
        return getTextFromElement(check2ndDayAirText);
    }

    public String verifyFinalTotal() {
        Reporter.log("verifyFinalTotal" + checkLastTotal.toString());
        return getTextFromElement(checkLastTotal);
    }

    public void clickOnConfirmButton() {
        Reporter.log("clickOnConfirmButton" + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public String verifyThankYouText() {
        Reporter.log("verifyThankYouText" + checkThankYouText.toString());
        return getTextFromElement(checkThankYouText);
    }

    public String verifySuccessfullyProcessedMessage() {
        Reporter.log("verifySuccessfullyProcessedMessage" + successfullyMessage.toString());
        return getTextFromElement(successfullyMessage);
    }

    public void clickOnContinue() {
        Reporter.log("clickOnContinue" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }

    public String verifyWelcomeToOurStoreText() {
        Reporter.log("verifyWelcomeToOurStoreText" + welcomeToOurStoreMessage.toString());
        return getTextFromElement(welcomeToOurStoreMessage);
    }

    public void clickOnLogoutLink() {
        Reporter.log("clickOnLogoutLink" + logoutLink.toString());
        clickOnElement(logoutLink);
    }
}


