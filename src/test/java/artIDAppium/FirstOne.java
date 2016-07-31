package artIDAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class FirstOne {

    RemoteWebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "9.3");
        capabilities.setCapability("browserName", "safari");

        this.driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
    }
    
    
    
    @BeforeMethod
    public void navigateToUrl(){
		this.driver.get("https://jungle-socks.herokuapp.com/");
    }
    
   

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	
}



