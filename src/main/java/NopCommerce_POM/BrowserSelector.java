package NopCommerce_POM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BrowserSelector extends Utils {

LoadProp props = new LoadProp();
public void setUpBrowser(){
String browser= props.getProperty("browser");//Storing the value of browser of config file in a string
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Resources\\Webdriver\\chromedriver.exe");//calling the chromedriver path
            ChromeOptions options= new ChromeOptions();
            //options.addArguments("disable-infobars");
            //options.addArguments("--disable-extensions");
            //options.addArguments("--disable-setUpBrowser-side-navigation");
            //options.addArguments("incognito");
            //options.addArguments("--disable-blink-features=BlockCredentialedSubresources");
            //driver=new ChromeDriver(options);
            driver = new ChromeDriver();//creating chrome driver object

        }
        else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "src\\test\\java\\Resources\\Webdriver\\geckodriver.exe");//calling the geckodriver path
            driver = new FirefoxDriver();//creating chrome driver object
            driver.manage().window().fullscreen();//to maximise the web page.
            driver.manage().timeouts().implicitlyWait(30, SECONDS);//waiting time before opening teh website
        }
        else{
            System.out.println("Browser name is either empty or typed wrong: " + browser );
        }


}

















}
