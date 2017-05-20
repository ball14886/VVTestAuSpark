package verificationandvalidation.ausparktest.Provider;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

/**
 * Created by supanattechasothon on 5/18/2017 AD.
 */

public class SecurityProvider {

    GeneralProvider generalProvider = new GeneralProvider();

    public Boolean isAuthorization(AppiumDriver driver){
        Boolean isLogin = generalProvider.existsElementByID(driver, "edu.au.auspark:id/edtID");
        return !isLogin;
    }
}
