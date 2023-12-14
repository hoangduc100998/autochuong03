package AutomationWebFramework.taotasktheoPOM.testcases;

import AutomationWebFramework.taotasktheoPOM.Actions.commons.BaseTest;
import AutomationWebFramework.taotasktheoPOM.Actions.pageObjects.LoginPageObjects;
import AutomationWebFramework.taotasktheoPOM.Actions.pageObjects.CreateTaskPageObjects;
import AutomationWebFramework.taotasktheoPOM.Utilities.Helpers.ExcelHelpers;
import AutomationWebFramework.taotasktheoPOM.Utilities.Listeners.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TC02_ReadFromExcel extends BaseTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = getDriver();

    }

    @Test (priority = 0)
    public void Test_Login() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/main/java/AutomationWebFramework/taotasktheoPOM/TestData/Login.xlsx", "Sheet1");
        LoginPageObjects.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Task() throws InterruptedException {
        CreateTaskPageObjects.Task(driver, "Bug 2", "Bug không login được", "23-11-2023", "24-11-2023" );
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}
