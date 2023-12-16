package AutomationWebFramework2.BT_TaoMoi3Event.Utilities.Listeners;

import AutomationWebFramework2.BT_TaoMoi3Event.Actions.pageObjects.LoginPageObject;
import org.testng.*;
import org.testng.log4testng.Logger;

//Log result of each TCs
public class TestListener implements ITestListener, ISuiteListener {
    Logger logger = Logger.getLogger(LoginPageObject.class.getClass());
    int totalTCs = 0, passedTCs = 0, skippedTCs = 0, failedTCs = 0;

    @Override
    public void onFinish(ISuite iSuite) {
        logger.info("== Nhu : Finish TestSuite");
        // Show info finish to trace in CI/CD
    }

    @Override
    public void onStart(ITestContext result) {
        logger.info("== Nhu : Start TestSuite");
        // Show suite info to trace in CI/CD or init report
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Tên của testcase failed nhưng có phần trăm passed là:" + result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Đây là test case bị fail: " + result.getName());


    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Đây là test case bị bỏ qua: " + result.getName());

    }

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Đây là test case chạy thành công: " + result.getName());

    }
}
