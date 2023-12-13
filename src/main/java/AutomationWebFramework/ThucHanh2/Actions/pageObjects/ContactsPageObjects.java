package AutomationWebFramework.ThucHanh2.Actions.pageObjects;
import AutomationWebFramework.ThucHanh2.Interfaces.ContactsPageUI;
import AutomationWebFramework.ThucHanh2.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static AutomationWebFramework.ThucHanh2.Interfaces.ContactsPageUI.total_Clients;

public class ContactsPageObjects {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    private static WebDriverWait wait;
    public static void Client (WebDriver driver)  {
        basePage.getElementText(driver, total_Clients);
        String totalClientsText = basePage.getElementText(driver, total_Clients);
        System.out.println("Total Clients Overview: " + totalClientsText);
        //Chuyển sang tab Contacts
        basePage.clickToElement(driver, ContactsPageUI.Clients);


    }
}
