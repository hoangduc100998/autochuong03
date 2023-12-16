package AutomationWebFramework2.BT_TaoMoi3Event.Actions.pageObjects;

import AutomationWebFramework2.BT_TaoMoi3Event.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import AutomationWebFramework2.BT_TaoMoi3Event.Interfaces.LoginPageUI;

public class LoginPageObject {

    WebDriver driver;
    private static BasePage basePage=new BasePage();
    //PageActions
    public static void Login(WebDriver driver , String username, String password) {
        basePage.sendKeyToElement(driver,LoginPageUI.xpathUserName,username);
        basePage.sendKeyToElement(driver,LoginPageUI.xpathPassword,password);
        basePage.clickToElement(driver,LoginPageUI.xpathLoginButton);

    }

}
