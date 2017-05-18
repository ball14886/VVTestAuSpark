package verificationandvalidation.ausparktest.Provider;

import android.sax.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;


import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

/**
 * Created by supanattechasothon on 5/9/2017 AD.
 */

public class GeneralProvider {

    ActionProvider actionProvider = new ActionProvider();

    public void SwipeToOpenNavigationBar(AppiumDriver driver) throws Exception {
        actionProvider.SwipeHorizontal(driver,0.01,0.8,0.5,500);
    }

    public void SwipeNavigationBarToClose(AppiumDriver driver) throws Exception{
        actionProvider.SwipeHorizontal(driver,0.95,0.93,0.1,10);
    }

    public void SwipeMenuSidebarTopToDown(AppiumDriver driver) throws Exception{
        actionProvider.SwipeVertical(driver,0.9,0.1,0.5,500);
    }

    public void SwipeMenuSidebarDownToTop(AppiumDriver driver) throws Exception{
        actionProvider.SwipeVertical(driver,0.1,0.9,0.5,500);
    }

    public boolean existsElementByID(AppiumDriver driver, String id) {
        try {
            driver.findElement(By.id(id));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public boolean existsElementByClass(AppiumDriver driver, String className) {
        try {
            driver.findElements(By.className(className));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public MobileElement getElementByID(AppiumDriver driver, String byID){
        if (existsElementByID(driver, byID)) {
            MobileElement element = (MobileElement) driver.findElement(By.id(byID));
            return element;
        }
        return null;
    }

    public List<MobileElement> getElementByClassName(AppiumDriver driver, String byClassName){
        if (existsElementByClass(driver, byClassName)) {
            List<MobileElement> elementList = (List<MobileElement>) driver.findElement(By.className(byClassName));
            return elementList;
        }
        return null;
    }

    public void threadSleep(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public Boolean stringComparision(String one, String two){
        return one.trim().toLowerCase().equals(two.trim().toLowerCase());
    }



}
