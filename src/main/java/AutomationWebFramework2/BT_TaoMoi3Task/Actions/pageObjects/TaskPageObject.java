package AutomationWebFramework2.BT_TaoMoi3Task.Actions.pageObjects;

import AutomationWebFramework2.BT_TaoMoi3Task.Actions.commons.BasePage;
import AutomationWebFramework2.BT_TaoMoi3Task.Interfaces.TaskPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskPageObject {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Task(WebDriver driver, String title, String Des, String start, String deadline ) throws InterruptedException {
        basePage.clickToElement(driver, TaskPageUI.click_add);
        basePage.sendKeyToElement(driver,TaskPageUI.add_title,title);
        basePage.sendKeyToElement(driver,TaskPageUI.add_Description,Des);
        basePage.clickToElement(driver, TaskPageUI.click_Related);
        basePage.clickToElement(driver, TaskPageUI.select_Related);
        Thread.sleep(3000);
        basePage.clickToElement(driver, TaskPageUI.click_Contract);
        basePage.clickToElement(driver, TaskPageUI.select_Contract);
        Thread.sleep(3000);
        basePage.clickToElement(driver, TaskPageUI.click_Point);
        basePage.clickToElement(driver, TaskPageUI.select_Point);
        basePage.clickToElement(driver, TaskPageUI.click_Assign);
        basePage.clickToElement(driver, TaskPageUI.select_Assign);
        basePage.clickToElement(driver, TaskPageUI.click_Collaborators);
        basePage.clickToElement(driver, TaskPageUI.select_Collaborators);
        basePage.clickToElement(driver, TaskPageUI.click_Status);
        basePage.clickToElement(driver, TaskPageUI.select_Status);
        basePage.clickToElement(driver, TaskPageUI.click_Priority);
        basePage.clickToElement(driver, TaskPageUI.select_Priority);
        basePage.clickToElement(driver, TaskPageUI.click_Labels);
        basePage.clickToElement(driver, TaskPageUI.select_Labels);
        basePage.sendKeyToElement(driver,TaskPageUI.start_date,start);
        basePage.sendKeyToElement(driver,TaskPageUI.deadline,deadline);
        basePage.clickToElement(driver, TaskPageUI.Recurring);
        basePage.clickToElement(driver, TaskPageUI.Save);
        Thread.sleep(3000);
    }
}
