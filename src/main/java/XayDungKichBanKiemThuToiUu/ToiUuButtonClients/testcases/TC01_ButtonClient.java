package XayDungKichBanKiemThuToiUu.ToiUuButtonClients.testcases;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Actions.commons.BaseTest;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Actions.pageObjects.ClientsPageObject;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Actions.pageObjects.LoginPageObjects;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Actions.pageObjects.LogoutPageObject;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Utilities.Helpers.ExcelHelpers;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Utilities.Listeners.ReportListener;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Utilities.Listeners.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class, ReportListener.class})
public class TC01_ButtonClient extends BaseTest {
    private static WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        driver = getDriver();
    }

    @Test (priority = 0)
    public void Test_Login() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(
                "src/main/java/XayDungKichBanKiemThuToiUu/ToiUuButtonClients/TestData/Login.xlsx",
                "Sheet1");
        LoginPageObjects.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }

    @Test (priority = 1)
    public void Test_ClientPage() {
        ClientsPageObject.ClientPage(driver);

    }

    @Test (priority = 2)
    public void Test_Logout() {
        LogoutPageObject.Logout(driver);
    }

    @AfterClass
    public void afterClass() throws Exception{
        tearDown();
    }
}
