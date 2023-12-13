package AutomationWebFramework.ThucHanh3.Actions.pageObjects;
import AutomationWebFramework.ThucHanh3.Actions.commons.BasePage;
import AutomationWebFramework.ThucHanh3.Interfaces.TaskPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskPageObjects {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    private static WebDriverWait wait;
    public static void Task(WebDriver driver)  {
        basePage.isElementDisplayed(driver, TaskPageUI.import_Task);
        basePage.isElementDisplayed(driver, TaskPageUI.add_Multiple);
        basePage.isElementDisplayed(driver, TaskPageUI.add_Task);
        basePage.isElementDisplayed(driver, TaskPageUI.colum);
        basePage.isElementDisplayed(driver, TaskPageUI.filter);
        basePage.isElementDisplayed(driver, TaskPageUI.all_Task);
        basePage.isElementDisplayed(driver, TaskPageUI.all_Bug);
        basePage.isElementDisplayed(driver, TaskPageUI.button_i);
        basePage.isElementDisplayed(driver, TaskPageUI.excel);
        basePage.isElementDisplayed(driver, TaskPageUI.print);
        basePage.isElementDisplayed(driver, TaskPageUI.search);
    }
}
