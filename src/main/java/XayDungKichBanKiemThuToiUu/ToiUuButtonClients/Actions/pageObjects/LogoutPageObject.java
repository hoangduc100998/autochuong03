package XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Actions.pageObjects;

import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Actions.commons.BasePage;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Interfaces.LogoutPageUI;
import org.openqa.selenium.WebDriver;

public class LogoutPageObject {

    private static BasePage basePage = new BasePage();

    public static void Logout(WebDriver driver){
        basePage.isElementDisplayed(driver, LogoutPageUI.imgP);
        basePage.clickToElement(driver, LogoutPageUI.img_click);
        basePage.clickToElement(driver, LogoutPageUI.signout_btn);
    }
}
