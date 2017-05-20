package verificationandvalidation.ausparktest;

import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import verificationandvalidation.ausparktest.Function_CallTest.Academic_Record.Test_GradeList;
import verificationandvalidation.ausparktest.Function_CallTest.Student.Test_Login;
import verificationandvalidation.ausparktest.Provider.GeneralProvider;
import verificationandvalidation.ausparktest.Provider.SecurityProvider;
import verificationandvalidation.ausparktest.Provider.SetupProvider;

/**
 * Created by supanattechasothon on 5/20/2017 AD.
 */

public class Main {
    AppiumDriver driver;
    SetupProvider setupProvider = new SetupProvider();
    SecurityProvider securityProvider = new SecurityProvider();

    @Before
    public void setUp() throws MalformedURLException {
        driver = new AndroidDriver(new URL(setupProvider.GetAndroidDriverURL()),setupProvider.GetDesiredCapabilities());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void RunTest() throws Exception {
        if (!securityProvider.isAuthorization(driver)){
            Test_Login loginTest = new Test_Login();
            loginTest.testLogin(driver);
        }


        AcademicRecord_Test();
    }

    public void AcademicRecord_Test() throws Exception {
        Test_GradeList gradeListTest = new Test_GradeList();
        gradeListTest.Test_GradeList(driver);
    }

    public void ClassSchedule_Test(){

    }

    public void PreRegistration_Test(){

    }

    public void tearDown(){
        driver.quit();
    }
}
