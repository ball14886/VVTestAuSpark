package verificationandvalidation.ausparktest.Function_CallTest.Academic_Record;

import io.appium.java_client.AppiumDriver;

/**
 * Created by supanattechasothon on 5/29/2017 AD.
 */

public class T3_Main {


    public void Run(AppiumDriver driver) throws Exception {
        T3_01_GradeList(driver);
        T3_03_Transcript(driver);

    }

    public void T3_01_GradeList(AppiumDriver driver) throws Exception {
        T3_01_GradeList T3_01 = new T3_01_GradeList();
        T3_01.Test_T3_01_01();
    }

    public void T3_03_Transcript(AppiumDriver driver) throws Exception {
        T3_03_Transcript T3_03 = new T3_03_Transcript();
        T3_03.Test_T3_03_01();
    }

}
