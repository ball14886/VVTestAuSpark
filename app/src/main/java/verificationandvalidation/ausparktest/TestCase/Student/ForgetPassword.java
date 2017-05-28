package verificationandvalidation.ausparktest.TestCase.Student;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import verificationandvalidation.ausparktest.Provider.SetupProvider;

/**
 * Created by USER on 5/5/2017.
 */

public class ForgetPassword {

    AppiumDriver driver;
    SetupProvider setupProvider = new SetupProvider();

    @Before
    public void setUp() throws MalformedURLException{
        driver = new AndroidDriver(new URL(setupProvider.GetAndroidDriverURL()),setupProvider.GetDesiredCapabilities());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void ForgetPassword() throws InterruptedException {

        driver.findElement(By.id("edu.au.auspark:id/forgetPassword")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Thread.sleep(2000);

        driver.findElement(By.id("edu.au.auspark:id/forget_password_studentcode")).sendKeys("5610189");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.id("edu.au.auspark:id/forget_password_email")).sendKeys("ball148862@hotmail.com");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.id("edu.au.auspark:id/button1")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    public void tearDown(){
        driver.quit();
    }

}
