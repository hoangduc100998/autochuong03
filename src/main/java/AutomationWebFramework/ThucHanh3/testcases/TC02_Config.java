package AutomationWebFramework.ThucHanh3.testcases;
import AutomationWebFramework.ThucHanh3.Actions.commons.BaseTest;
import AutomationWebFramework.ThucHanh3.Actions.pageObjects.LoginPageObjects;
import AutomationWebFramework.ThucHanh3.Actions.pageObjects.HomePageObjects;
import AutomationWebFramework.ThucHanh3.Actions.pageObjects.TaskPageObjects;
import AutomationWebFramework.ThucHanh3.Utilities.Helpers.PropertiesFile;
import AutomationWebFramework.ThucHanh3.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportListener.class)
public class TC02_Config extends BaseTest {
    //ExtentReports extent=new ExtentReports();
    //ExtentSparkReporter spark=new ExtentSparkReporter("ExtentReport.html");
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PropertiesFile.setPropertiesFile();
        //extent.attachReporter(spark);

    }

    @Test (priority = 0)
    public void Test_Login() {
        LoginPageObjects.Login
                (driver, PropertiesFile.getPropValue("username"),
                        PropertiesFile.getPropValue("password"));
    }

    @Test (priority = 1)
    public void Test_Home(){
        HomePageObjects.Home(driver);
    }

    @Test (priority = 2)
    public void Test_Task()  {
        TaskPageObjects.Task(driver);
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}