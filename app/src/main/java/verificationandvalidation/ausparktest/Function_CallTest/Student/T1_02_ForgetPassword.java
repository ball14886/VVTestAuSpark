package verificationandvalidation.ausparktest.Function_CallTest.Student;

import org.junit.Assert;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T1_02_ForgetPassword {

    Functions func = new Functions();

    public void Test_T1_02_01(AppiumDriver driver) throws InterruptedException {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("5611779");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("supanat@hotmail.com");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_4();


    }

    public void Test_T1_02_02(AppiumDriver driver) throws InterruptedException {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_4();


    }

    public void Test_T1_02_03(AppiumDriver driver) throws InterruptedException {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("5611779");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_4();


    }

    public void Test_T1_02_04(AppiumDriver driver) throws InterruptedException {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("supanat@hotmail.com");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_4();


    }

}
