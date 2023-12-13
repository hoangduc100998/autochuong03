package AutomationWebFramework.ThucHanh2.testcases;


import AutomationWebFramework.ThucHanh2.Actions.commons.BaseTest;
import AutomationWebFramework.ThucHanh2.Actions.pageObjects.ContactsDetailPageObjects;
import AutomationWebFramework.ThucHanh2.Actions.pageObjects.ContactsPageObjects;
import AutomationWebFramework.ThucHanh2.Actions.pageObjects.LoginPageObjects;
//import AutomationWebFramework.ThucHanh2.Actions.pageObjects.ClientPage;
//import AutomationWebFramework.ThucHanh2.Actions.pageObjects.ClientDetailPage;
import AutomationWebFramework.ThucHanh2.Utilities.Helpers.ExcelHelpers;
import AutomationWebFramework.ThucHanh2.Utilities.Listeners.TestListener;
import AutomationWebFramework.ThucHanh2.Actions.pageObjects.HomePageObjects;
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
        excel.setExcelFile
                ("src/main/java/AutomationWebFramework/ThucHanh2/TestData/Login.xlsx",
                        "Sheet1");
        LoginPageObjects.Login(driver, excel.getCellData
                ("username",1),
                excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Home(){
        HomePageObjects.Home(driver);
    }
    @Test (priority = 2)
    public void Test_Client()  {
        ContactsPageObjects.Client(driver);
    }
    @Test (priority = 3)
    public void Test_ClientDetail()  {
        ContactsDetailPageObjects.Detail(driver);
    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}
