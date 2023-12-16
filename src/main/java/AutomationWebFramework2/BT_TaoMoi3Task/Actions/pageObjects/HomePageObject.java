package AutomationWebFramework2.BT_TaoMoi3Task.Actions.pageObjects;

import AutomationWebFramework2.BT_TaoMoi3Task.Actions.commons.BasePage;
import AutomationWebFramework2.BT_TaoMoi3Task.Interfaces.HomePageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePageObject {
    private static WebElement element = null;
    //menu
    static BasePage basePage=new BasePage();
    //Page Actions
    public static void Home(WebDriver driver){
        basePage.clickToElement(driver,HomePageUI.tasksMenu);
    }
}
