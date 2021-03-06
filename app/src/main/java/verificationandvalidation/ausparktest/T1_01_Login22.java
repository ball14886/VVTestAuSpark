package verificationandvalidation.ausparktest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Provider.Functions;
import verificationandvalidation.ausparktest.Provider.SecurityProvider;
import verificationandvalidation.ausparktest.Provider.SetupProvider;

import static verificationandvalidation.ausparktest.Main.driver;

/**
 * Created by USER on 5/5/2017.
 */

public class T1_01_Login22 {

//    AppiumDriver driver;
    SetupProvider setupProvider = new SetupProvider();
    Functions func = new Functions();
    SecurityProvider securityProvider = new SecurityProvider();


//    @Before
//    public void setUp() throws MalformedURLException{
//        driver = new AndroidDriver(new URL(setupProvider.GetAndroidDriverURL()),setupProvider.GetDesiredCapabilities());
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//    }
//    @Test
//    public void testLogin(AppiumDriver driver) throws Exception {
//
//        System.out.println("isLogin: " + func.isAuthorization(driver));
//
//        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("5611779");
//        func.threadSleep(200);
//
//        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("0841533610");
//        func.threadSleep(100);
//
//        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
//
//        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//
//        func.threadSleep(4000);
////        System.out.println("isLogin: " + securityProvider.isAuthorization(driver));
////        generalProvider.SwipeToOpenNavigationBar(driver);
////        generalProvider.threadSleep(1000);
////        //generalProvider.SwipeNavigationBarToClose(driver);
////        generalProvider.SwipeMenuSidebarTopToDown(driver);
////        generalProvider.threadSleep(1000);
////        generalProvider.SwipeMenuSidebarDownToTop(driver);
////        generalProvider.threadSleep(1000);
////        generalProvider.SwipeNavigationBarToClose(driver);
//
//        List<MobileElement> list = func.getElementByID(driver, "edu.au.auspark:id/toolbar").findElements(By.className("android.widget.ImageButton"));
//        System.out.println("list: " + list.size());
//        list.get(0).click();
//
//    }

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T1_01_01() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("5611779");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("supantoyy");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_5();


        boolean isLogin = func.isAuthorization(driver);
        Assert.assertTrue(isLogin);
        System.out.println("Test_T1_01_01()");
    }

    @Test
    public void Test_T1_01_02() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_5();

        System.out.println("Test_T1_01_02()");
        boolean isLogin = func.isAuthorization(driver);
        Assert.assertFalse(isLogin);
    }

    @Test
    public void Test_T1_01_03() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("5611779");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("1");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_4();

        boolean isLogin = func.isAuthorization(driver);
        Assert.assertFalse(isLogin);
    }

    @Test
    public void Test_T1_01_04() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("1");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_4();

        boolean isLogin = func.isAuthorization(driver);
        Assert.assertFalse(isLogin);
    }

    @Test
    public void Test_T1_01_05() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("1");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_4();

        boolean isLogin = func.isAuthorization(driver);
        Assert.assertFalse(isLogin);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
