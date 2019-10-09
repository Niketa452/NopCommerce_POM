package NopCommerce_POM;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendDetails extends Utils {
LoadProp props = new LoadProp();


    private By _friendemail=By.className("friend-email");
    private By _personalmessage=By.xpath("//textarea");
    private By _sendemail=By.name("send-email");
    private By _confirmationMessage =By.xpath("//div[@class='result']");
    private By _myemail=By.id("YourEmailAddress");
    private By _erroremailmessage=By.xpath("//li[contains(text(),'Only registered customers can use email a friend f')]");

public void registeredUserShouldBeAbleToReferAProductToAFriend(){
enterText(_friendemail, props.getProperty("FriendEmail"));
enterText(_myemail, props.getProperty("Emailstart"));
enterText(_personalmessage, props.getProperty("MessageToAFriend"));
clickElement(_sendemail);
String actualMessage = getTextFromContent(_confirmationMessage);
Assert.assertEquals(actualMessage, props.getProperty("expectedReferProductMessage"));
}
public void onlyRegisteredMemebersToBeAbleToReferProductToAFriend() {
    enterText(_friendemail, props.getProperty("FriendEmail"));
    enterText(_myemail, props.getProperty("MyWrongEmail"));
    enterText(_personalmessage, props.getProperty("MessageToAFriend"));
    clickElement(_sendemail);
    String errormailmessage=getTextFromContent(_erroremailmessage);
    Assert.assertEquals(errormailmessage, props.getProperty("ErrorEmailMessage"));

}

}
