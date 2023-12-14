package AutomationWebFramework.taotasktheoPOM.testcases;
import AutomationWebFramework.taotasktheoPOM.Actions.commons.BaseTest;
import AutomationWebFramework.taotasktheoPOM.Actions.pageObjects.LoginPageObjects;
import AutomationWebFramework.taotasktheoPOM.Actions.pageObjects.CreateTaskPageObjects;
import AutomationWebFramework.taotasktheoPOM.Utilities.Helpers.PropertiesFile;
import AutomationWebFramework.taotasktheoPOM.Utilities.Listeners.ReportListener;
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
        LoginPageObjects.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
//        ExtentTest test=extent.createTest("Verify log in");
//        test.log(Status.PASS,"user login");
//        test.pass("login verified");
    }

    @Test (priority = 1)
    public void Test_Task() throws InterruptedException {
        CreateTaskPageObjects.Task(driver, "Bug 1", "Bug không login được", "23-11-2023", "24-11-2023" );
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}