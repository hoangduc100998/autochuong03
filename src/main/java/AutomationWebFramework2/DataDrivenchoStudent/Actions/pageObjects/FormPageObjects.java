package AutomationWebFramework2.DataDrivenchoStudent.Actions.pageObjects;

import AutomationWebFramework2.DataDrivenchoStudent.Actions.commons.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import AutomationWebFramework2.DataDrivenchoStudent.Interfaces.FormUI;

public class FormPageObjects {

    WebDriver driver;
    private static BasePage basePage=new BasePage();
    //PageActions
    public static void Form(WebDriver driver , String username, String email, String address, String perAdd) {
        basePage.sendKeyToElement(driver,FormUI.xpathUserName,username);
        basePage.sendKeyToElement(driver,FormUI.xpathEmail,email);
        basePage.sendKeyToElement(driver,FormUI.xpathAddress,address);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        basePage.sendKeyToElement(driver,FormUI.xpathPermaentAddress,perAdd);
        basePage.clickToElement(driver,FormUI.xpathSubmit);
    }

}
