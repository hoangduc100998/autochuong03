package AutomationWebFramework2.BT_TaoMoi3Event.Actions.pageObjects;
import AutomationWebFramework2.BT_TaoMoi3Event.Actions.commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import AutomationWebFramework2.BT_TaoMoi3Event.Interfaces.EventPageUI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class EventPageObject {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Event(WebDriver driver, String title, String Des, String startdate, String enddate, String starttime, String endtime, String locations) throws InterruptedException {
        basePage.clickToElement(driver, EventPageUI.add_event);
        basePage.sendKeyToElement(driver,EventPageUI.add_title,title);
        basePage.sendKeyToElement(driver,EventPageUI.add_Description,Des);
        Thread.sleep(3000);
        basePage.sendKeyToElement(driver, EventPageUI.start_date, startdate);
        //sendKeyToElement1 là dùng win, đổi qua 2 cho có cmd+a
        basePage.sendKeyToElement2(driver, EventPageUI.start_time, starttime);
        basePage.sendKeyToElement(driver, EventPageUI.end_date, enddate);
        //sendKeyToElement1 là dùng win, đổi qua 2 cho có cmd+a
        basePage.sendKeyToElement2(driver, EventPageUI.end_time, endtime);
        basePage.sendKeyToElement(driver, EventPageUI.add_location, locations);
        basePage.clickToElement(driver, EventPageUI.client);
        basePage.clickToElement(driver, EventPageUI.option);
        basePage.clickToElement(driver, EventPageUI.dialog);
        basePage.clickToElement(driver, EventPageUI.Save);
    }
}
