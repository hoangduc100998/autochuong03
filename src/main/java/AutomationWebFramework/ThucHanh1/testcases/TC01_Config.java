package AutomationWebFramework.ThucHanh1.testcases;

import AutomationWebFramework.ThucHanh1.Actions.commons.BaseTest;
import AutomationWebFramework.ThucHanh1.Actions.pageObjects.LoginPageObjects;
import AutomationWebFramework.ThucHanh1.Actions.pageObjects.HomePageObjects;
//import AutomationWebFramework.ThucHanh1.Actions.pageObjects.ClientPage;
//import AutomationWebFramework.ThucHanh1.Actions.pageObjects.ClientDetailPage;
import AutomationWebFramework.ThucHanh1.Utilities.Helpers.ExcelHelpers;
import AutomationWebFramework.ThucHanh1.Utilities.Helpers.PropertiesFile;
import AutomationWebFramework.ThucHanh1.Utilities.Listeners.ReportListener;
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


    @Test(priority = 0)
    public void Test_Login1() throws Exception {
        //Setup đường dẫn của file excel
        //Setup đường dẫn của file excel
        //Setup đường dẫn của file excel
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile("src/main/java/AutomationWebFramework/ThucHanh1/TestData/Login.xlsx",
                "Sheet1");
        LoginPageObjects.Login(driver, excel.getCellData("username", 1), excel.getCellData("password", 1));
        Thread.sleep(1000);
    }

    @Test (priority = 1)
    public void Test_Home(){
        HomePageObjects.Home (driver);
    }
//    @Test (priority = 2)
//    public void Test_Client()  {
//        ClientPage.Client(driver);
//    }
//    @Test (priority = 3)
//    public void Test_ClientDetail()  {
//        ClientDetailPage.Detail(driver);
//    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}
