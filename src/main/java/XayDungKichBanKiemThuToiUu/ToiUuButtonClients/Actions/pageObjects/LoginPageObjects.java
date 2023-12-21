package XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Actions.pageObjects;

import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Interfaces.LoginPageUI;

import java.util.HashMap;
public class LoginPageObjects {

    private static BasePage basePage = new BasePage();

    public static void Login(WebDriver driver , String username, String password){
        basePage.sendKeyToElement(driver, LoginPageUI.Username_txt,username);
        basePage.sendKeyToElement(driver,LoginPageUI.Password_txt,password);
        basePage.clickToElement(driver,LoginPageUI.Login_btn);
    }

}
