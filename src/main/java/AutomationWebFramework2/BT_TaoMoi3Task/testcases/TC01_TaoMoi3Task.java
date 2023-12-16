package AutomationWebFramework2.BT_TaoMoi3Task.testcases;

import AutomationWebFramework2.BT_TaoMoi3Task.Actions.commons.BaseTest;
import AutomationWebFramework2.BT_TaoMoi3Task.Actions.pageObjects.HomePageObject;
import AutomationWebFramework2.BT_TaoMoi3Task.Actions.pageObjects.LoginPageObject;
import AutomationWebFramework2.BT_TaoMoi3Task.Actions.pageObjects.TaskPageObject;
import AutomationWebFramework2.BT_TaoMoi3Task.Utilities.Helpers.ExcelHelpers;
import AutomationWebFramework2.BT_TaoMoi3Task.Utilities.Listeners.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TC01_TaoMoi3Task extends BaseTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = getDriver();

    }

    @Test (priority = 0)
    public void Test_Login() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/main/java/AutomationWebFramework2/BT_TaoMoi3Task/TestData/Login.xlsx", "Sheet1");
        LoginPageObject.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Home() throws InterruptedException {
        HomePageObject.Home(driver);
    }
    @Test (priority = 2)
    public void Test_task1() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/main/java/AutomationWebFramework2/BT_TaoMoi3Task/TestData/Task.xlsx", "Sheet1");
        TaskPageObject.Task(driver, excel.getCellData("title",1),excel.getCellData("description",1),excel.getCellData("start",1),excel.getCellData("deadline",1));
        Thread.sleep(1000);
    }
    @Test (priority = 3)
    public void Test_Home1() throws InterruptedException {
        HomePageObject.Home(driver);
    }
    @Test (priority = 4)
    public void Test_task2() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/main/java/AutomationWebFramework2/BT_TaoMoi3Task/TestData/Task.xlsx",
                "Sheet1");
        TaskPageObject.Task(driver, excel.getCellData("title",2),excel.getCellData("description",2),excel.getCellData("start",2),excel.getCellData("deadline",2));
        Thread.sleep(1000);
    }
    @Test (priority = 5)
    public void Test_Home2() throws InterruptedException {
        HomePageObject.Home(driver);
    }
    @Test (priority = 6)
    public void Test_task3() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/main/java/AutomationWebFramework2/BT_TaoMoi3Task/TestData/Task.xlsx",
                "Sheet1");
        TaskPageObject.Task(driver, excel.getCellData("title",3),
                excel.getCellData("description",3),
                excel.getCellData("start",3),
                excel.getCellData("deadline",3));
        Thread.sleep(1000);
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}
