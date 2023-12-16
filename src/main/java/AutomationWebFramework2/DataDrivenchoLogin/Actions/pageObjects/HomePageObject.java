package AutomationWebFramework2.DataDrivenchoLogin.Actions.pageObjects;

import AutomationWebFramework2.DataDrivenchoLogin.Actions.commons.BasePage;
import AutomationWebFramework2.DataDrivenchoLogin.Interfaces.HomePageUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObject {
    private static BasePage basePage = new BasePage();
    public static void Logout(WebDriver driver){
        basePage.isElementDisplayed(driver, HomePageUI.imgP);
        basePage.clickToElement(driver, HomePageUI.img_click);
        basePage.clickToElement(driver, HomePageUI.signout_btn);
    }
}
