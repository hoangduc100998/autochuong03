//package AutomationWebFramework2.DataDrivenchoStudent.testcases;
//
//import AutomationWebFramework2.DataDrivenchoStudent.Actions.commons.BaseTest;
//import AutomationWebFramework2.DataDrivenchoStudent.Utilities.Listeners.TestListener;
//import AutomationWebFramework2.DataDrivenchoStudent.Actions.pageObjects.InputPageObject;
//import AutomationWebFramework2.DataDrivenchoStudent.Actions.pageObjects.LoadPageObject;
//import jdk.jfr.Description;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//
//import java.util.HashMap;
//
//@Listeners(TestListener.class)
//public class TC02_Load extends BaseTest {
//    private WebDriver driver;
//    //    InputPageObject input;
//    @BeforeClass
//    public void beforeClass() {
//        driver = getDriver();
////        input = new InputPageObject(driver);
//    }
//
//    @Test ( priority = 0)
//    public void Test_OpenPage(){
//        LoadPageObject.LoadPage(driver);
//    }
//
//    @Test( priority = 1, dataProvider = "RISE_Login", dataProviderClass = TH_Login.Utilities.Helpers.PropertiesFile.class)
//    @Description("Verify the login function")
//    public void Test_LoadPage(HashMap<String, String> data) {
////        input.inputStudentInfo(data);
//        InputPageObject.inputStudentInfoExcel(driver,
//                data.get("fullName"),
//                data.get("email"),
//                data.get("address"),
//                data.get("permanentAddress"));
//    }
//
//    @AfterClass
//    public void afterTest() throws Exception{
//        tearDown();
//    }
//}
