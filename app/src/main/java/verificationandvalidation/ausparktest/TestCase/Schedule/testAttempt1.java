package verificationandvalidation.ausparktest.TestCase.Schedule;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by USER on 5/5/2017.
 */

public class testAttempt1 {

    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("deviceName", "Nexus5X");

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

        capabilities.setCapability(CapabilityType.VERSION, "6.0");

        capabilities.setCapability("appPackage", "edu.au.auspark");

        capabilities.setCapability("appActivity","edu.au.auspark.SplashScreen");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void testLogin(){

        driver.findElement(By.id("edu.au.auspark:id/edtID")).sendKeys("5610189");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.id("edu.au.auspark:id/edtPass")).sendKeys("0841533610");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.id("edu.au.auspark:id/btnLogin")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.tap(1,30,180,10);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.tap(1,50,180,10);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.tap(1,40,100,10);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        TouchAction tapCoordinates = new TouchAction(driver); //where driver is AppiumDriver
        tapCoordinates.tap(50,180).perform();



    }

    public void tearDown(){
        driver.quit();
    }

}
