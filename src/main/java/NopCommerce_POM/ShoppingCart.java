package NopCommerce_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ShoppingCart extends Utils {
    LoadProp props = new LoadProp();
    private By _terms = By.xpath("//input[@id='termsofservice']");
    private By _checkoutbutton = By.xpath("//button[@id='checkout']");
    private By _emailforshopping = By.xpath("//input[@id='Email']");
    private By _passwordforshopping = By.xpath("//input[@id='Password']");
    private By _clicklogin = By.xpath("//input[@class='button-1 login-button']");
    private By _gettext= By.xpath("//a[@title='Show details for Fahrenheit 451 by Ray Bradbury']");

    public void checkout() {
        clickElement(_terms);//click on terms and condition
        clickElement(_checkoutbutton);//click on checkout button
        String bookname=getAttributefromWebelement(_gettext, "title");//storing book title in a string variable
        Assert.assertEquals(bookname, props.getProperty("shoppingcartproductassert"));//asserting product in the cart is same as chosen



    }
}
