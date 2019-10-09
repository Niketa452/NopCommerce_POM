package NopCommerce_POM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BaseTest extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    static String timestamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());
    LoadProp props = new LoadProp();

    @BeforeMethod
    public void setupBrowser() {
        browserSelector.setUpBrowser();
        driver.manage().window().fullscreen();//to maximise the web page.
        driver.manage().timeouts().implicitlyWait(30, SECONDS);//waiting time before opening teh website
        driver.get(props.getProperty("url"));
    }

    @AfterMethod
    public void teardown() {
        driver.quit();


    }
}




