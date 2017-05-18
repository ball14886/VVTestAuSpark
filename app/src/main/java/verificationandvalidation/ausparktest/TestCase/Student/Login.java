package verificationandvalidation.ausparktest.TestCase.Student;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import verificationandvalidation.ausparktest.Provider.GeneralProvider;
import verificationandvalidation.ausparktest.Provider.SecurityProvider;
import verificationandvalidation.ausparktest.Provider.SetupProvider;

/**
 * Created by USER on 5/5/2017.
 */

public class Login {

    AppiumDriver driver;
    SetupProvider setupProvider = new SetupProvider();
    GeneralProvider generalProvider = new GeneralProvider();
    SecurityProvider securityProvider = new SecurityProvider();

    @Before
    public void setUp() throws MalformedURLException{
        driver = new AndroidDriver(new URL(setupProvider.GetAndroidDriverURL()),setupProvider.GetDesiredCapabilities());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void testLogin() throws Exception {

        System.out.println("isLogin: " + securityProvider.isAuthorization(driver));

        generalProvider.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("5610189");
        generalProvider.threadSleep(2000);

        generalProvider.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("0841533610");
        generalProvider.threadSleep(2000);

        generalProvider.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        generalProvider.threadSleep(5000);
        System.out.println("isLogin: " + securityProvider.isAuthorization(driver));
        generalProvider.SwipeToOpenNavigationBar(driver);
        generalProvider.threadSleep(1000);
        //generalProvider.SwipeNavigationBarToClose(driver);
        generalProvider.SwipeMenuSidebarTopToDown(driver);
        generalProvider.threadSleep(1000);
        generalProvider.SwipeMenuSidebarDownToTop(driver);
        generalProvider.threadSleep(1000);
        generalProvider.SwipeNavigationBarToClose(driver);

    }



    public void tearDown(){
        driver.quit();
    }

}
