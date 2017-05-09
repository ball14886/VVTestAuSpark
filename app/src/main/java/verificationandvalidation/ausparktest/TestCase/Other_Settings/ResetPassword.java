package verificationandvalidation.ausparktest.TestCase.Other_Settings;

import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
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
    public void testLogin(){

      

    }

    public void tearDown(){
        driver.quit();
    }

}
