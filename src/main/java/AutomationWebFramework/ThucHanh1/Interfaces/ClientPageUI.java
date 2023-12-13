package AutomationWebFramework.ThucHanh1.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public ClientPageUI(WebDriver driver) {
        this.driver = driver;
    }

    //Tìm cái Total client là bao nhiêu
    public static String total_Clients =
            "//div[@class='widget-details']/h1[following-sibling::span[text()='Total clients']]";

    //Chọn để kích qua tab Clients
    public static String Clients = "//a[text()='Clients']";

}
