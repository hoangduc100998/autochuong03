package AutomationWebFramework.ThucHanh2.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public ContactsPageUI (WebDriver driver) {
        this.driver = driver;
    }

    //Tìm cái Total client là bao nhiêu
    public static String total_Clients =
            "//div[@class='widget-details']/h1[following-sibling::span[text()='Total contacts']]";

    //Chọn để kích qua tab Contacts
    public static String Clients = "//a[text()='Contacts']";

}
