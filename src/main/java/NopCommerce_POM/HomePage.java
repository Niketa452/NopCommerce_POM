package NopCommerce_POM;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends Utils {


    LoadProp props = new LoadProp();
    private By _registerbutton = By.xpath("//a[@class='ico-register']");
    private By _computer =By.linkText("Computers");
    private  By _notebook = By.linkText("Notebooks");
    private By _clickProduct=By.linkText("Apple MacBook Pro 13-inch");
    private By _clickbooks =By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");



    public void clickonregisterbutton() {
        clickElement(_registerbutton);
    }

    public void validatecurrenturl() {
        validateURL(props.getProperty("expectedurl"));
    }

    public void validatetitle() {

        verifyandgetTitle(props.getProperty("titleexpected"));
    }


    public void clickOnAProductToReferToAFriend() {
        clickElement(_computer);//click on computer category on homepage
        clickElement(_notebook);//click on notebook subcategory on homepage
        clickElement(_clickProduct);//click on Apple Macbook pro to refer to a friend
    }
    public void buybooks(){
    clickElement(_clickbooks);

    }
}