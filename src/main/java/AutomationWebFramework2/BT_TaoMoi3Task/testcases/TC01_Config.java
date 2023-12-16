package AutomationWebFramework2.BT_TaoMoi3Task.testcases;
import AutomationWebFramework2.BT_TaoMoi3Task.Actions.commons.BaseTest;
import AutomationWebFramework2.BT_TaoMoi3Task.Actions.pageObjects.HomePageObject;
import AutomationWebFramework2.BT_TaoMoi3Task.Actions.pageObjects.LoginPageObject;
import AutomationWebFramework2.BT_TaoMoi3Task.Actions.pageObjects.TaskPageObject;
import AutomationWebFramework2.BT_TaoMoi3Task.Utilities.Helpers.PropertiesFile;
import AutomationWebFramework2.BT_TaoMoi3Task.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportListener.class)
public class TC01_Config extends BaseTest {
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PropertiesFile.setPropertiesFile();
    }

    @Test (priority = 0)
    public void Test_login() throws InterruptedException {
        LoginPageObject.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
    }

    @Test (priority = 1)
    public void Test_Home() throws InterruptedException {
        HomePageObject.Home(driver);
    }
    @Test (priority = 2)
    public void Test_case_01() throws InterruptedException {
        TaskPageObject.Task(driver, PropertiesFile.getPropValue("title1"), PropertiesFile.getPropValue("description1"), PropertiesFile.getPropValue("start1"), PropertiesFile.getPropValue("deadline1") );
    }
    @Test (priority = 3)
    public void Test_Home1() {
        HomePageObject.Home(driver);
    }

    @Test (priority = 4)
    public void Test_case_02() throws InterruptedException {
        TaskPageObject.Task(driver, PropertiesFile.getPropValue("title2"), PropertiesFile.getPropValue("description2"), PropertiesFile.getPropValue("start2"), PropertiesFile.getPropValue("deadline2") );
    }
    @Test (priority = 5)
    public void Test_Home2() {
        HomePageObject.Home(driver);
    }

    @Test (priority = 6)
    public void Test_case_03() throws InterruptedException {
        TaskPageObject.Task(driver, PropertiesFile.getPropValue("title3"), PropertiesFile.getPropValue("description3"), PropertiesFile.getPropValue("start3"), PropertiesFile.getPropValue("deadline3") );
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}