package verificationandvalidation.ausparktest.Provider;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * Created by supanattechasothon on 5/9/2017 AD.
 */

public class Functions extends SetupProvider{

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
    public void scrollTopToDown_1(AppiumDriver driver) throws Exception{
        actionProvider.SwipeVertical(driver,0.9,0.80,0.99,1500);
    }
    public void scrollTopToDown_2(AppiumDriver driver) throws Exception{
        actionProvider.SwipeVertical(driver,0.9,0.65,0.99,1500);
    }
    public void scrollTopToDown_3(AppiumDriver driver) throws Exception{
        actionProvider.SwipeVertical(driver,0.9,0.4,0.99,1500);
    }
    public void scrollTopToDown_4(AppiumDriver driver) throws Exception{
        actionProvider.SwipeVertical(driver,0.9,0.28,0.99,1500);
    }
//    public void scrollTop_ScreenOne(AppiumDriver driver) throws Exception{
//        actionProvider.SwipeVertical(driver,0.25,0.9,0.99,1500);
//    }

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

//    public MobileElement getElementByID(AppiumDriver driver, String byID){
//        if (existsElementByID(driver, byID)) {
//            MobileElement element = (MobileElement) driver.findElement(By.id(byID));
//            return element;
//        }
//        return null;
//    }



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
        Thread.sleep(14000);
    }

    public Boolean stringComparision(String one, String two){
        return one.trim().toLowerCase().equals(two.trim().toLowerCase());
    }

    //------------------------------ Find Text + Auto Scroll -------------------------------------------------

    public MobileElement getElementByID(AppiumDriver driver, String id) throws Exception { // Check existsElementByID if not scroll down
        if (existsElementByID(driver, id)){
            return (MobileElement) driver.findElement(By.id(id));
        }
        else {
            ScrollToTargetValue_ElementByID(driver, id);
        }
        return null;
    }

    public MobileElement getElementByID(AppiumDriver driver, MobileElement element , String id) throws Exception { // Check existsElementByID if not scroll down
        if (existsElement_and_ElementByID(element, id)){
            return element.findElement(By.id(id));
        }
        else {
            MobileElement a = new MobileElement() {
                @Override
                public void sendKeys(CharSequence... keysToSend) {
                    super.sendKeys(keysToSend);
                }

                @Override
                public String getText() {
                    return super.getText();
                }
            };
            a.sendKeys("");
            return a;
            //ScrollToTargetValue_ElementByID(driver, element, id);
        }
       //return null;
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

    public void navigateBack(AppiumDriver driver){
        driver.navigate().back();
    }

    public void hideKeyboard(AppiumDriver driver){
        driver.hideKeyboard();
    }
}
