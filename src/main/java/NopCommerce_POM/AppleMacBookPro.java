package NopCommerce_POM;

import org.openqa.selenium.By;

public class AppleMacBookPro extends Utils {
LoadProp props = new LoadProp();

    private By _emailafriend=By.xpath("//input[@value='Email a friend']");

public void clickonAProduct(){
clickElement(_emailafriend);


 }



}
