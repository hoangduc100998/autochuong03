package FaceBook.CheckPage.testcases;

import FaceBook.CheckPage.Actions.pageObjects.LoginPageObjects;
import FaceBook.CheckPage.Actions.commons.BaseTest;
import FaceBook.CheckPage.Actions.pageObjects.viewPageObjects;
import FaceBook.CheckPage.Utilities.Helpers.PropertiesFile;
import FaceBook.CheckPage.Utilities.Listeners.ReportListener;
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
    public void Test_Login() throws InterruptedException {
        LoginPageObjects.Login(driver, PropertiesFile.getPropValue("username"),
                PropertiesFile.getPropValue("password"));
    }
    @Test(priority = 2)
    public void viewPage() throws InterruptedException {
        viewPageObjects.viewPage(driver);
    }
}
