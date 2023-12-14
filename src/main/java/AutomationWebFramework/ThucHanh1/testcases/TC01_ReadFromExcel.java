package AutomationWebFramework.ThucHanh1.testcases;


import AutomationWebFramework.ThucHanh1.Actions.commons.BaseTest;
import AutomationWebFramework.ThucHanh1.Actions.pageObjects.ClientDetailPageObjects;
import AutomationWebFramework.ThucHanh1.Actions.pageObjects.ClientPageObjects;
import AutomationWebFramework.ThucHanh1.Actions.pageObjects.LoginPageObjects;
//import AutomationWebFramework.ThucHanh1.Actions.pageObjects.ClientPage;
//import AutomationWebFramework.ThucHanh1.Actions.pageObjects.ClientDetailPage;
import AutomationWebFramework.ThucHanh1.Utilities.Helpers.ExcelHelpers;
import AutomationWebFramework.ThucHanh1.Utilities.Listeners.ReportListener;
import AutomationWebFramework.ThucHanh1.Utilities.Listeners.TestListener;
import AutomationWebFramework.ThucHanh1.Actions.pageObjects.HomePageObjects;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

@Listeners(ReportListener.class)
public class TC01_ReadFromExcel extends BaseTest {
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }
    @Test (priority = 0)
    public void Test_Login() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/main/java/AutomationWebFramework/ThucHanh1/TestData/Login.xlsx", "Sheet1");
        LoginPageObjects.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Home(){
        HomePageObjects.Home(driver);
    }
    @Test (priority = 2)
    public void Test_Client() throws InterruptedException {
       String totalClient = ClientPageObjects.getTotalClientOverview(driver);
       String totalClientOnList = ClientDetailPageObjects.getTotalClientOnList(driver);
        Assert.assertEquals(totalClient, totalClientOnList);

    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}
