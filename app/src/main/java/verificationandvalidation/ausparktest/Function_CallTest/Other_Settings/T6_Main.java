package verificationandvalidation.ausparktest.Function_CallTest.Other_Settings;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Function_CallTest.Advisor.T2_01_AdvisorContact;
import verificationandvalidation.ausparktest.Function_CallTest.Advisor.T2_02_AdvisorInformation;

/**
 * Created by supanattechasothon on 5/29/2017 AD.
 */

public class T6_Main {


    public void Run(AppiumDriver driver) throws Exception {
        T6_02_ResetPassword(driver);
    }

    public void T6_02_ResetPassword(AppiumDriver driver) throws Exception {
        T6_02_ResetPassword T2_01 = new T6_02_ResetPassword();
        T2_01.Test_T6_02_01(driver);
        T2_01.Test_T6_02_02(driver);
        T2_01.Test_T6_02_03(driver);
        T2_01.Test_T6_02_04(driver);
        T2_01.Test_T6_02_05(driver);
    }
}
