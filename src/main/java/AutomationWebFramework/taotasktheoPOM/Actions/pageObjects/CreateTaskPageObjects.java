package AutomationWebFramework.taotasktheoPOM.Actions.pageObjects;

import AutomationWebFramework.taotasktheoPOM.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import AutomationWebFramework.taotasktheoPOM.Interfaces.CreateTaskPageUI;

public class CreateTaskPageObjects {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Task(WebDriver driver, String title, String Des, String start, String deadline ) throws InterruptedException {
        basePage.clickToElement(driver, CreateTaskPageUI.click_Tasks);
        basePage.clickToElement(driver, CreateTaskPageUI.click_add);
        basePage.sendKeyToElement(driver, CreateTaskPageUI.add_title,title);
        basePage.sendKeyToElement(driver, CreateTaskPageUI.add_Description,Des);
        Thread.sleep(1000);
        basePage.clickToElement(driver, CreateTaskPageUI.click_Related);
        basePage.clickToElement(driver, CreateTaskPageUI.select_Related);
        Thread.sleep(500);
        basePage.clickToElement(driver, CreateTaskPageUI.click_Contract);
        basePage.clickToElement(driver, CreateTaskPageUI.select_Contract);
        basePage.clickToElement(driver, CreateTaskPageUI.click_Point);
        basePage.clickToElement(driver, CreateTaskPageUI.select_Point);
        basePage.clickToElement(driver, CreateTaskPageUI.click_Assign);
        basePage.clickToElement(driver, CreateTaskPageUI.select_Assign);
        basePage.clickToElement(driver, CreateTaskPageUI.click_Collaborators);
        basePage.clickToElement(driver, CreateTaskPageUI.select_Collaborators);
        basePage.clickToElement(driver, CreateTaskPageUI.click_Status);
        basePage.clickToElement(driver, CreateTaskPageUI.select_Status);
        basePage.clickToElement(driver, CreateTaskPageUI.click_Priority);
        basePage.clickToElement(driver, CreateTaskPageUI.select_Priority);
        basePage.clickToElement(driver, CreateTaskPageUI.click_Labels);
        basePage.clickToElement(driver, CreateTaskPageUI.select_Labels);
        basePage.sendKeyToElement(driver, CreateTaskPageUI.start_date,start);
        basePage.sendKeyToElement(driver, CreateTaskPageUI.deadline,deadline);
        basePage.clickToElement(driver, CreateTaskPageUI.Recurring);
        basePage.clickToElement(driver, CreateTaskPageUI.Save);
    }
}
