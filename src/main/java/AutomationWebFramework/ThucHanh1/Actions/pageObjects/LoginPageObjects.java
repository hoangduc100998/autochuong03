package AutomationWebFramework.ThucHanh1.Actions.pageObjects;
import AutomationWebFramework.ThucHanh1.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import AutomationWebFramework.ThucHanh1.Interfaces.LoginPageUI;
public class LoginPageObjects {
    WebDriver driver;
    private static BasePage basePage=new BasePage();
    //PageActions
    public static void Login(WebDriver driver , String username, String password) {
        basePage.sendKeyToElement(driver,LoginPageUI.xpathUserName,username);
        basePage.sendKeyToElement(driver,LoginPageUI.xpathPassword,password);
        basePage.clickToElement(driver,LoginPageUI.xpathLoginButton);

    }
}
