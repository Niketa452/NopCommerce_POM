package NopCommerce_POM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    AppleMacBookPro appleMacBookPro = new AppleMacBookPro();
    EmailAFriendDetails emailAFriendDetails = new EmailAFriendDetails();
    BuyBooks buyBooks= new BuyBooks();
    ShoppingCart shoppingCart = new ShoppingCart();
    Checkout checkout = new Checkout();

    @Test
    public void userShouldBeAbleToRegistersuccessfully() {
        homePage.validatecurrenturl();//gets current title;
        homePage.clickonregisterbutton();//clicking registration button on homepage
        registrationPage.verifyURL();//verifying registration page URL
        registrationPage.enteringAngValidatingRegistration();//enter registration details and asserting confirmation message
        registrationPage.navigateBackToHomePAge();

    }
    @Test
        public void registeredUserShouldBeAbleToReferProductToAFriend(){
        userShouldBeAbleToRegistersuccessfully();
        homePage.clickOnAProductToReferToAFriend();
        appleMacBookPro.clickonAProduct();
        emailAFriendDetails.registeredUserShouldBeAbleToReferAProductToAFriend();
    }
@Test
    public void unregisteredUserShouldNotBeAbleToReferAProductToAFriend(){
    homePage.clickOnAProductToReferToAFriend();
    appleMacBookPro.clickonAProduct();
    emailAFriendDetails.onlyRegisteredMemebersToBeAbleToReferProductToAFriend();
    }
    @Test
    public void userShouldBeAbleToBuyProductSuccessfully(){
        userShouldBeAbleToRegistersuccessfully();
        homePage.buybooks();
        buyBooks.buybook();
        shoppingCart.checkout();
        checkout.fillCheckoutForm();
    }
    @Test
    public void guestUserShouldBeAbleToProductSuccessfully(){
        homePage.buybooks();
        buyBooks.buybook();
        shoppingCart.checkout();
        checkout.checkoutAsAGuest();
        checkout.fillFormAsGuest();
        checkout.fillCheckoutForm();


    }


}











