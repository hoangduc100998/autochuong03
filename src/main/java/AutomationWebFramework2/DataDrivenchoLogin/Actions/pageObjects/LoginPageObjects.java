package AutomationWebFramework2.DataDrivenchoLogin.Actions.pageObjects;

import AutomationWebFramework2.DataDrivenchoLogin.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import AutomationWebFramework2.DataDrivenchoLogin.Interfaces.LoginPageUI;

import java.util.HashMap;

public class LoginPageObjects {
    WebDriver driver;
    private static BasePage basePage = new BasePage();

    public LoginPageObjects (WebDriver driver) {
        this.driver = driver;
    }

    public static void Login(WebDriver driver , String username, String password){
        basePage.sendKeyToElement(driver,LoginPageUI.Username_txt,username);
        basePage.sendKeyToElement(driver,LoginPageUI.Password_txt,password);
        basePage.clickToElement(driver,LoginPageUI.Login_btn);
    }

}
