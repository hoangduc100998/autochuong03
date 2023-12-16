package AutomationWebFramework2.BT_TaoMoi3Event.testcases;

import AutomationWebFramework2.BT_TaoMoi3Event.Actions.commons.BaseTest;
import AutomationWebFramework2.BT_TaoMoi3Event.Actions.pageObjects.HomePageObject;
import AutomationWebFramework2.BT_TaoMoi3Event.Actions.pageObjects.LoginPageObject;
import AutomationWebFramework2.BT_TaoMoi3Event.Actions.pageObjects.EventPageObject;
import AutomationWebFramework2.BT_TaoMoi3Event.Utilities.Helpers.ExcelHelpers;
import AutomationWebFramework2.BT_TaoMoi3Event.Utilities.Listeners.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TC02_TaoMoi3Event extends BaseTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = getDriver();

    }

    @Test (priority = 0)
    public void Test_Login() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/main/java/AutomationWebFramework2/BT_TaoMoi3Event/TestData/Login.xlsx", "Sheet1");
        LoginPageObject.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Home1() throws InterruptedException {
        HomePageObject.Home(driver);
    }
    @Test(priority = 2)
    public void createEventsFromExcel() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile("src/main/java/AutomationWebFramework2/BT_TaoMoi3Event/TestData/event.xlsx", "Sheet1");

        int numberOfEvents = 3; // Số lượng event cần tạo

        for (int i = 1; i <= numberOfEvents; i++) {
            createEvent(driver, excel, i);
            Thread.sleep(1000); // Đợi để chắc chắn event trước đã được tạo xong
            HomePageObject.Home(driver); // Quay lại trang Home
        }
    }
    private void createEvent(WebDriver driver, ExcelHelpers excel, int row) throws Exception {
        EventPageObject.Event(driver,
                excel.getCellData("title", row),
                excel.getCellData("des", row),
                excel.getCellData("startdate", row),
                excel.getCellData("enddate", row),
                excel.getCellData("starttime", row),
                excel.getCellData("endtime", row),
                excel.getCellData("locations", row));
    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}
