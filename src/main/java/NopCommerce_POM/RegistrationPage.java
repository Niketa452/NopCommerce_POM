package NopCommerce_POM;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils {
    LoadProp props = new LoadProp();

    private By _firstname=By.id("FirstName");
    private By _lastname=By.xpath("//input[@name='LastName']");
    private By _email=By.name("Email");
    private By _password=By.id("Password");
    private By _confirmpassword = By.xpath("//input[@name='ConfirmPassword']");
    private By _submitbutton= By.xpath("//input[@type='submit' and @name='register-button']");
    private By _registrationmessage= By.className("result");
    private By _clickicon= By.xpath("//img");

    public void verifyURL(){
        validateURL(props.getProperty("registerURLexpected"));
    }
    public void enteringAngValidatingRegistration() {
        enterText(_firstname, props.getProperty("FirstName"));//enter frist name
        enterText(_lastname, props.getProperty("LastName"));//enter last name
        enterText(_email, props.getProperty("Emailstart") + randomdate() + props.getProperty("Emailend"));//enter email
        enterText(_password, props.getProperty("Password"));//enter passoword
        enterText(_confirmpassword, props.getProperty("Password"));//enter confirm password
        clickElement(_submitbutton);//click on submit button
        String actualMessage = getTextFromContent(_registrationmessage);//storing message in a string variable
        Assert.assertEquals(actualMessage, props.getProperty("expectedRegistrationMessage"));//asserting registration completed message
    }
     public void navigateBackToHomePAge(){
         clickElement(_clickicon);//click on nopcommerce icon to navigate back to homepage
     }
     }








