package AutomationWebFramework.ThucHanh3.Actions.pageObjects;

import AutomationWebFramework.ThucHanh3.Interfaces.HomePageUI;
import AutomationWebFramework.ThucHanh3.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjects {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    private static WebDriverWait wait;
    public static void Home(WebDriver driver){
        basePage.isElementDisplayed(driver, HomePageUI.text_dashboard);
        basePage.clickToElement(driver, HomePageUI.menu_task);
    }
}
