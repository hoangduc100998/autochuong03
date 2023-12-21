package FaceBook.CheckPage.testcases;
import FaceBook.CheckPage.Actions.commons.BaseTest;
import FaceBook.CheckPage.Actions.pageObjects.LoginPageObjects;
import FaceBook.CheckPage.Actions.pageObjects.viewPageObjects;
import FaceBook.CheckPage.Utilities.Helpers.ExcelHelpers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@Listeners(TestListener.class)
public class TC01_LoginExcel extends BaseTest {
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
                ("src/main/java/FaceBook/CheckPage/TestData/Login.xlsx",
                "Sheet1");
        LoginPageObjects.Login(driver, excel.getCellData
                ("username",1),
                excel.getCellData("password",1));
        Thread.sleep(10000);
    }

//    @Test (priority = 1)
//    public void new_tab() throws Exception {
//        ExcelHelpers excel=new ExcelHelpers();
//        excel.setExcelFile("src/main/java/FaceBook/CheckPage/TestData/Login.xlsx",
//                "Sheet1");
//        submitCodePageObjects.newTab(driver, excel.getCellData("layma",1));
//        //b5. Dán macode_txt vào rồi submit
//        //String maCode = submitCodePageObjects.newTab(driver);
//        Thread.sleep(10000);
//    }

    @Test (priority = 2)
    public void viewPage() throws Exception {
        viewPageObjects.viewPage(driver);
        Thread.sleep(5000);
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}
