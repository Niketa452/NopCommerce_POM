package NopCommerce_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class Checkout extends Utils {
LoadProp props = new LoadProp();

private By _countryarrow=By.xpath("//select[@id='BillingNewAddress_CountryId']");
private By _country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
private By _city =By.xpath("//input[@id='BillingNewAddress_City']");
private By _addressline1=By.xpath("//input[@id='BillingNewAddress_Address1']");
private By _zipcode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
private By _phonenumber=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
private By _continue = By.xpath("//div[@id='billing-buttons-container']//input[@class='button-1 new-address-next-step-button']");
private By _continues= By.xpath("//input[@class='button-1 shipping-method-next-step-button']");
private By _creditcard= By.xpath("//input[@type='radio' and @id='paymentmethod_1']");
private By _cardholderName= By.xpath("//input[@id='CardholderName']");
private By _visacardnumber=By.xpath("//input[@id='CardNumber']");
private By _expDate=By.xpath("//select[@id='ExpireMonth']");
private By _expyear=By.xpath("//select[@id='ExpireYear']");
private By _cardcode=By.xpath("//input[@id='CardCode']");
private By _continue_agian= By.xpath("//input[@onclick='PaymentMethod.save()']");
private By _continueaftercarddetails=By.xpath("//input[@class='button-1 payment-info-next-step-button']");
private By _confirm=By.xpath("//input[@class='button-1 confirm-order-next-step-button']");
private By _thankyoumessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

private By _guest=By.xpath("//input[@class='button-1 checkout-as-guest-button']");
private By _billingname=By.xpath("//input[@id='BillingNewAddress_FirstName']");
private By _billinglastname=By.xpath("//input[@id='BillingNewAddress_LastName']");
private By _billingemail = By.xpath("//input[@id='BillingNewAddress_Email']");




public void fillCheckoutForm(){
        selectByValue(_country, "233");//select united kingdom by value
        enterText(_city, props.getProperty("city_checkout"));//enter city
        enterText(_addressline1, props.getProperty("addressLine1"));//enter address
        enterText(_zipcode, props.getProperty("zipcode"));//enter zipcode
        enterText(_phonenumber, props.getProperty("phonenumber"));//enter phonenumber
        clickElement(_continue);//continue
        clickElement(_continues);//continue again
        clickElement(_creditcard);//click on credit card radio button
        clickElement(_continue_agian);
        enterText(_cardholderName, props.getProperty("cardholderName"));
        enterText(_visacardnumber, props.getProperty("visanumber"));
        selectByValue(_expDate, "5");//expiry date
        selectByValue(_expyear, "2021");
        enterText(_cardcode, props.getProperty("cardcode"));
        clickElement(_continueaftercarddetails);
        clickElement(_confirm);
        String thankyou_message=getTextFromContent(_thankyoumessage);
        Assert.assertEquals(thankyou_message, props.getProperty("shoppingThankYouMessage"));

    }
    public void checkoutAsAGuest(){
     clickElement(_guest);
    }
    public void fillFormAsGuest(){
    enterText(_billingname, props.getProperty("billingName"));
    enterText(_billinglastname, props.getProperty("billngLastName"));
    enterText(_billingemail, props.getProperty("billingEmailAddress"));


    }
}
