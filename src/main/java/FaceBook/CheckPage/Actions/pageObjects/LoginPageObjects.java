package FaceBook.CheckPage.Actions.pageObjects;

import FaceBook.CheckPage.Actions.commons.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import FaceBook.CheckPage.Interfaces.LoginPageUI;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
public class LoginPageObjects {

    private static BasePage basePage = new BasePage();

    public static void Login(WebDriver driver , String username, String password) throws InterruptedException {
        basePage.sendKeyToElement(driver, LoginPageUI.Username_txt, username);
        basePage.sendKeyToElement(driver, LoginPageUI.Password_txt, password);
        basePage.clickToElement(driver, LoginPageUI.Login_btn);
        // Lưu trữ ID của cửa sổ cha
        String parentWindow = driver.getWindowHandle();

        // Mở tab mới và chuyển đến trang đăng nhập
        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
        newTab.get("https://lay2fa.com/");

        driver.findElement(By.xpath("//textarea[@id=\"SECRET2FA\"]")).sendKeys("2QOO7DOHBFFUKQR6GEFYXVUPAJRDFUXN");

        basePage.clickToElement(driver, LoginPageUI.click_btn);
        Thread.sleep(1000);
        basePage.clickToElement(driver, LoginPageUI.copy_btn);
        // Tắt tab 2fa đi chứ nó click hoài
        driver.close();

        // Chuyển về cửa sổ cha (parent window)
        driver.switchTo().window(parentWindow);
        WebElement inputField = driver.findElement(By.xpath("//input[@id='approvals_code']"));
        inputField.sendKeys(Keys.COMMAND + "v");
        basePage.clickToElement(driver, LoginPageUI.submit1_btn);
        basePage.clickToElement(driver, LoginPageUI.submit2_btn);
    }
}
