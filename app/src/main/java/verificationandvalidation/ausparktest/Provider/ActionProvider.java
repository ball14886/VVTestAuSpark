package verificationandvalidation.ausparktest.Provider;

import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

/**
 * Created by supanattechasothon on 5/16/2017 AD.
 */

public class ActionProvider {

    public void SwipeHorizontal(AppiumDriver driver, double startPercentage,
                                double finalPercentage, double anchorPercentage,
                                int duration) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        new TouchAction(driver).press(startPoint, anchor).waitAction(duration)
                .moveTo(endPoint, anchor).release().perform();
    }

    public static void SwipeVertical(AppiumDriver driver, double startPercentage,
                                     double finalPercentage, double anchorPercentage,
                                     int duration) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        new TouchAction(driver).press(anchor, startPoint).waitAction(duration)
                .moveTo(anchor, endPoint).release().perform();
    }

}
