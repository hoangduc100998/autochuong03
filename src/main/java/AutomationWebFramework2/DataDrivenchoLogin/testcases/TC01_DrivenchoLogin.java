package AutomationWebFramework2.DataDrivenchoLogin.testcases;

import AutomationWebFramework2.DataDrivenchoLogin.Actions.commons.BaseTest;
import AutomationWebFramework2.DataDrivenchoLogin.Actions.pageObjects.HomePageObject;
import AutomationWebFramework2.DataDrivenchoLogin.Actions.pageObjects.LoginPageObjects;
import AutomationWebFramework2.DataDrivenchoLogin.Utilities.Helpers.ExcelHelpers;
import AutomationWebFramework2.DataDrivenchoLogin.Utilities.Listeners.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TC01_DrivenchoLogin extends BaseTest {
    private WebDriver driver;
    private LoginPageObjects login;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    @Test (priority = 0)
    public void Test_Login() throws Exception{
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile("src/main/java/AutomationWebFramework2/DataDrivenchoLogin/TestData/Login.xlsx",
                "Sheet1");

        for (int i = 1; i < 4; i++){
            login.Login(driver,
                    excel.getCellData("username", i),
                    excel.getCellData("password", i));
            HomePageObject.Logout(driver);
        }
    }
    @AfterClass
    public void afterTest() throws Exception{
        tearDown();
    }
}
