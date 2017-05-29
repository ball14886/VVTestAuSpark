package verificationandvalidation.ausparktest.Provider;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * Created by supanattechasothon on 5/9/2017 AD.
 */

public class Functions {

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
    public void ScrollTopToDown_ScreenOne(AppiumDriver driver) throws Exception{
        actionProvider.SwipeVertical(driver,0.9,0.25,0.99,1500);
    }

    public boolean existsElementByID(AppiumDriver driver, String id) {
        try {
            driver.findElement(By.id(id));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }
    public boolean existsElement_and_ElementByID(MobileElement element, String id) {
        try {
            element.findElement(By.id(id));
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
            List<MobileElement> elementList = (List<MobileElement>)
                    driver.findElement(By.className(byClassName));
            return elementList;
        }
        return null;
    }

    public void threadSleep(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void threadSleep_1() throws InterruptedException {
        Thread.sleep(300);
    }

    public void threadSleep_2() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void threadSleep_3() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void threadSleep_4() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void threadSleep_5() throws InterruptedException {
        Thread.sleep(8000);
    }

    public Boolean stringComparision(String one, String two){
        return one.trim().toLowerCase().equals(two.trim().toLowerCase());
    }

    //------------------------------ Find Text + Auto Scroll -------------------------------------------------

    public String GetText_ElementByID(AppiumDriver driver,String id) throws Exception { // Check existsElementByID if not scroll down
        Functions generalProvider = new Functions();

        if (generalProvider.existsElementByID(driver, id)){
            return generalProvider.getElementByID(driver, id).getText();
        }
        else {
            ScrollToTargetValue_ElementByID(driver, id);
        }
        return "";
    }

    public String GetText_ElementByID(AppiumDriver driver,MobileElement element ,String id) throws Exception { // Check existsElementByID if not scroll down
        Functions generalProvider = new Functions();

        if (generalProvider.existsElement_and_ElementByID(element, id)){
            return element.findElement(By.id(id)).getText();
        }
        else {
            ScrollToTargetValue_ElementByID(driver, element, id);
        }
        return "";
    }

    public void ScrollToTargetValue_ElementByID(AppiumDriver driver, String id) throws Exception {
        System.out.println("ScrollToTargetValue_ElementByID(id)");
        Functions generalProvider = new Functions();

        Boolean isFound = false;
        while (!isFound){
            if (!generalProvider.existsElementByID(driver, id)){ // not found
                generalProvider.ScrollTopToDown_ScreenOne(driver);
            }
            else {
                isFound = true;
            }
        }
    }

    public void ScrollToTargetValue_ElementByID(AppiumDriver driver, MobileElement element,String id) throws Exception {
        System.out.println("ScrollToTargetValue_ElementByID(element,id)");
        Functions generalProvider = new Functions();

        Boolean isFound = false;
        while (!isFound){
            if (!generalProvider.existsElement_and_ElementByID(element, id)){ // not found
                generalProvider.ScrollTopToDown_ScreenOne(driver);
            }
            else {
                isFound = true;
            }
        }
    }

    public Boolean isAuthorization(AppiumDriver driver){
        Boolean isLogin = existsElementByID(driver, "edu.au.auspark:id/edtID");
        return !isLogin;
    }

}
