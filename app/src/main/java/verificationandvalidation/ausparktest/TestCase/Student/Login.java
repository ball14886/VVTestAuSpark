package verificationandvalidation.ausparktest.TestCase.Student;

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
import verificationandvalidation.ausparktest.Provider.GeneralProvider;
import verificationandvalidation.ausparktest.Provider.SetupProvider;

/**
 * Created by USER on 5/5/2017.
 */

public class Login {

    AppiumDriver driver;
    SetupProvider setupProvider = new SetupProvider();
    GeneralProvider generalProvider = new GeneralProvider();


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

        generalProvider.SwipeNavigationBarToOpen(driver);
        Thread.sleep(1000);
        //generalProvider.SwipeNavigationBarToClose(driver);
        generalProvider.SwipeMenuSidebarTopToDown(driver);
        Thread.sleep(1000);
        generalProvider.SwipeMenuSidebarDownToTop(driver);
        Thread.sleep(1000);
        generalProvider.SwipeNavigationBarToClose(driver);

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }



    public void tearDown(){
        driver.quit();
    }

}
