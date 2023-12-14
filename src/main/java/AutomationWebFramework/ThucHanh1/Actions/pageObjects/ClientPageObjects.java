package AutomationWebFramework.ThucHanh1.Actions.pageObjects;
import AutomationWebFramework.ThucHanh1.Interfaces.ClientPageUI;
import AutomationWebFramework.ThucHanh1.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static AutomationWebFramework.ThucHanh1.Interfaces.ClientPageUI.total_Clients;

public class ClientPageObjects {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    private static WebDriverWait wait;
    public static String getTotalClientOverview (WebDriver driver) throws InterruptedException {

        //Ham đợi không dùng thread nữa
        basePage.waitForElementVisible(driver, total_Clients);

        //basePage.getElementText(driver, total_Clients);
        String totalClientsText = basePage.getElementText(driver, total_Clients);
        //System.out.println("Total Clients Overview: " + totalClientsText);

        return totalClientsText;

        //Chuyển sang tab Clients
        //basePage.clickToElement(driver, ClientPageUI.Clients);
    }
}
