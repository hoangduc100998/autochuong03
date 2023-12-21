package XayDungKichBanKiemThuToiUu.ToiUuButtonClients.testcases;

import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Actions.pageObjects.LoginPageObjects;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Actions.commons.BaseTest;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Utilities.Helpers.PropertiesFile;
import XayDungKichBanKiemThuToiUu.ToiUuButtonClients.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(ReportListener.class)
public class TC01_Config extends BaseTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PropertiesFile.setPropertiesFile();
    }

    @Test(priority = 0)
    public void Test_Login() {
        LoginPageObjects.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
    }
}