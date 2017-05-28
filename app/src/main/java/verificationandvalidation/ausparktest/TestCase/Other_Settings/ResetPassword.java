package verificationandvalidation.ausparktest.TestCase.Other_Settings;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import verificationandvalidation.ausparktest.Provider.SetupProvider;

/**
 * Created by USER on 5/5/2017.
 */

public class ResetPassword {

    AppiumDriver driver;
    SetupProvider setupProvider = new SetupProvider();

    @Before
    public void setUp() throws MalformedURLException{
        driver = new AndroidDriver(new URL(setupProvider.GetAndroidDriverURL()),setupProvider.GetDesiredCapabilities());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void testLogin() throws Exception {

        driver.findElement(By.id("edu.au.auspark:id/edtID")).sendKeys("5610189");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("edu.au.auspark:id/edtPass")).sendKeys("0841533610");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("edu.au.auspark:id/btnLogin")).click();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        swipeHorizontal(driver,0.01,0.8,0.5,500);

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        swipeVertical(driver,0.8,0.01,0.3,500);

        driver.findElement(By.id("edu.au.auspark:id/item_reset_password")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Thread.sleep(2000);

        driver.findElement(By.id("edu.au.auspark:id/add_secondary_mail_address")).sendKeys("ball148862@hotmail.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("edu.au.auspark:id/add_secondary_phone_number")).sendKeys("0830169159");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("edu.au.auspark:id/add_secondary_current_password")).sendKeys("0841533610");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("edu.au.auspark:id/add_secondary_new_password")).sendKeys("ball14886");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("edu.au.auspark:id/add_secondary_confirm_new_password")).sendKeys("ball14886");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("edu.au.auspark:id/add_secondary_submit")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    public void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        new TouchAction(driver).press(startPoint, anchor).waitAction(duration).moveTo(endPoint, anchor).release().perform();
    }

    public void swipeVertical(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        new TouchAction(driver).press(startPoint, anchor).waitAction(duration).moveTo(endPoint, anchor).release().perform();
    }

    public void tearDown(){
        driver.quit();
    }

}
