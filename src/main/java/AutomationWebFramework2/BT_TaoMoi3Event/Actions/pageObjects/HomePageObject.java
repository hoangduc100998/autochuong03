package AutomationWebFramework2.BT_TaoMoi3Event.Actions.pageObjects;

import AutomationWebFramework2.BT_TaoMoi3Event.Actions.commons.BasePage;
import AutomationWebFramework2.BT_TaoMoi3Event.Interfaces.HomePageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
    private static WebElement element = null;
    //menu
    static BasePage basePage=new BasePage();
    //Page Actions
    public static void Home(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        basePage.clickToElement(driver,HomePageUI.eventMenu);
    }
}
