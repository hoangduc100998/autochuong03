package AutomationWebFramework2.DataDrivenchoStudent.testcases;

import AutomationWebFramework2.DataDrivenchoStudent.Actions.commons.BaseTest;
import AutomationWebFramework2.DataDrivenchoStudent.Actions.pageObjects.FormPageObjects;
import AutomationWebFramework2.DataDrivenchoStudent.Utilities.Helpers.PropertiesFile;
import AutomationWebFramework2.DataDrivenchoStudent.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportListener.class)
public class TC01_Config extends BaseTest {
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
    public void Test_Form() {
        FormPageObjects.Form(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("email"),PropertiesFile.getPropValue("address"),PropertiesFile.getPropValue("perAdd"));
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}