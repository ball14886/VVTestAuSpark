package verificationandvalidation.ausparktest.Provider;

import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

/**
 * Created by supanattechasothon on 5/9/2017 AD.
 */

public class GeneralProvider {

    public void SwipeNavigationBarToOpen(AppiumDriver driver) throws Exception {
        SwipeHorizontal(driver,0.01,0.8,0.5,500);
    }

    public void SwipeNavigationBarToClose(AppiumDriver driver) throws Exception{
        SwipeHorizontal(driver,0.95,0.93,0.1,10);
    }

    public void SwipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        new TouchAction(driver).press(startPoint, anchor).waitAction(duration).moveTo(endPoint, anchor).release().perform();
    }


    public void SwipeMenuSidebarTopToDown(AppiumDriver driver) throws Exception{
        SwipeVertical(driver,0.9,0.1,0.5,500);
    }

    public void SwipeMenuSidebarDownToTop(AppiumDriver driver) throws Exception{
        SwipeVertical(driver,0.1,0.9,0.5,500);
    }

    public static void SwipeVertical(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        new TouchAction(driver).press(anchor, startPoint).waitAction(duration).moveTo(anchor, endPoint).release().perform();

        //In documentation they mention moveTo coordinates are relative to initial ones, but thats not happening. When it does we need to use the function below
        //new TouchAction(driver).press(anchor, startPoint).waitAction(duration).moveTo(0,endPoint-startPoint).release().perform();
    }

}
