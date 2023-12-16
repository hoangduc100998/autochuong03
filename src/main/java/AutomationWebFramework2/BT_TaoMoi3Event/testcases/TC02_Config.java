package AutomationWebFramework2.BT_TaoMoi3Event.testcases;

import AutomationWebFramework2.BT_TaoMoi3Event.Actions.commons.BaseTest;
import AutomationWebFramework2.BT_TaoMoi3Event.Actions.pageObjects.HomePageObject;
import AutomationWebFramework2.BT_TaoMoi3Event.Actions.pageObjects.LoginPageObject;
import AutomationWebFramework2.BT_TaoMoi3Event.Actions.pageObjects.EventPageObject;
import AutomationWebFramework2.BT_TaoMoi3Event.Utilities.Helpers.PropertiesFile;
import AutomationWebFramework2.BT_TaoMoi3Event.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportListener.class)
public class TC02_Config extends BaseTest {
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PropertiesFile.setPropertiesFile();
    }

    @Test (priority = 0)
    public void Test_Login() {
        LoginPageObject.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
    }

    @Test (priority = 1)
    public void Test_Home1() throws InterruptedException {
        HomePageObject.Home(driver);
    }
    @Test (priority = 2)
    public void Test_event1() throws InterruptedException {
        EventPageObject.Event(driver, PropertiesFile.getPropValue("title1"), PropertiesFile.getPropValue("des1"), PropertiesFile.getPropValue("startdate1"), PropertiesFile.getPropValue("enddate1"),PropertiesFile.getPropValue("starttime1"), PropertiesFile.getPropValue("endtime1"), PropertiesFile.getPropValue("locations1"));
    }
    @Test (priority = 3)
    public void Test_Home2() throws InterruptedException {
        HomePageObject.Home(driver);
    }
    @Test (priority = 4)
    public void Test_event2() throws InterruptedException {
        EventPageObject.Event(driver, PropertiesFile.getPropValue("title2"), PropertiesFile.getPropValue("des2"), PropertiesFile.getPropValue("startdate2"), PropertiesFile.getPropValue("enddate2"),PropertiesFile.getPropValue("starttime2"), PropertiesFile.getPropValue("endtime2"), PropertiesFile.getPropValue("locations2"));
    }

    @Test (priority = 5)
    public void Test_Home3() throws InterruptedException {
        HomePageObject.Home(driver);
    }
    @Test (priority = 6)
    public void Test_event3() throws InterruptedException {
        EventPageObject.Event(driver, PropertiesFile.getPropValue("title3"), PropertiesFile.getPropValue("des3"), PropertiesFile.getPropValue("startdate3"), PropertiesFile.getPropValue("enddate3"),PropertiesFile.getPropValue("starttime3"), PropertiesFile.getPropValue("endtime3"), PropertiesFile.getPropValue("locations3"));
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}