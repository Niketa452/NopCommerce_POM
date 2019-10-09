package NopCommerce_POM;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuyBooks extends Utils {
    LoadProp props = new LoadProp();

private By _fahrenhiet = By.xpath("//img[@alt='Picture of Fahrenheit 451 by Ray Bradbury']");
private By _addtocart = By.cssSelector("#add-to-cart-button-37");
    private By _shoppingcart=By.xpath("//span[@class='cart-label']");
    private By _addtocartmessage =By.xpath("//a[contains(text(),'shopping cart')]");
    private By _close=By.xpath("//span[@class='close']");
public void buybook(){
    clickElement(_fahrenhiet);//click on a book
    clickElement(_addtocart);//click on add to cart
     clickElement(_shoppingcart);//click on shopping cart button
    validateURL(props.getProperty("shoppingcartpageassert"));//asserting product is added to the shopping cart page

}

}
