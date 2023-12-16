package AutomationWebFramework2.DataDrivenchoLogin.testcases;

import AutomationWebFramework2.DataDrivenchoLogin.Actions.commons.BaseTest;
import AutomationWebFramework2.DataDrivenchoLogin.Actions.pageObjects.HomePageObject;
import AutomationWebFramework2.DataDrivenchoLogin.Actions.pageObjects.LoginPageObjects;
import AutomationWebFramework2.DataDrivenchoLogin.Utilities.Helpers.PropertiesFile;
import AutomationWebFramework2.DataDrivenchoLogin.Utilities.Listeners.TestListener;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.util.HashMap;

@Listeners(TestListener.class)
public class TC01_Config extends BaseTest {
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    @Test( priority = 0, dataProvider = "RISE_Login", dataProviderClass = PropertiesFile.class)
    @Description("Verify the login function")
    public void Test_Login(HashMap<String, String> data) {
        LoginPageObjects.Login(driver, data.get("username"), data.get("password"));
        HomePageObject.Logout(driver);
    }
    @AfterClass
    public void afterTest() throws Exception{
        tearDown();
    }

}