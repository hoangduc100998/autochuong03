package AutomationWebFramework.ThucHanh2.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsDetailPageUI {
    private static WebElement element = null;
    WebDriver driver;
    public ContactsDetailPageUI(WebDriver driver) {

        this.driver = driver;
    }
    //Web locator
    public static String Clients = "//a[text()='Contacts']";
    public static String Total_Clients = "//div[@id='contact-table_info']";
}
