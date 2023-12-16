package AutomationWebFramework2.DataDrivenchoStudent.testcases;

import AutomationWebFramework2.DataDrivenchoStudent.Actions.commons.BaseTest;
import AutomationWebFramework2.DataDrivenchoStudent.Actions.pageObjects.FormPageObjects;
import AutomationWebFramework2.DataDrivenchoStudent.Utilities.Helpers.DemoReadJsonFile;
import AutomationWebFramework2.DataDrivenchoStudent.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

@Listeners(ReportListener.class)
public class TC01_Json extends BaseTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
        // Bạn có thể thêm code khởi tạo cho driver ở đây nếu cần
    }

    @Test (priority = 0)
    public void Form() throws InterruptedException {
        // Đọc tất cả các giá trị từ file JSON
        List<Map<String, String>>
                testCaseFieldsList = DemoReadJsonFile.getTestCaseFields("DemoQA_Registration_001_DataDriven");

        for (Map<String, String> testCaseFields : testCaseFieldsList) {
            // Sử dụng giá trị trong mỗi bản ghi (record) của test case
            FormPageObjects.Form(driver, testCaseFields.get("fullName"), testCaseFields.get("email"),testCaseFields.get("address"), testCaseFields.get("permanentAddress"));
        }
    }
}
