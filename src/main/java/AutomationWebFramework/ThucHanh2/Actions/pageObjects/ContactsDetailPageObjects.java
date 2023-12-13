package AutomationWebFramework.ThucHanh2.Actions.pageObjects;

import AutomationWebFramework.ThucHanh2.Interfaces.ContactsDetailPageUI;
import AutomationWebFramework.ThucHanh2.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsDetailPageObjects {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Detail(WebDriver driver) {
        basePage.clickToElement(driver, ContactsDetailPageUI.Clients);
        String totalClientsText = basePage.getElementText(driver, ContactsDetailPageUI.Total_Clients);
        //1-10 / 51 : Thì mình chỉ lấy số 51 nên chọn là [1] . trim là bỏ những kí tự trống, space, lấy mỗi số thôi
        //String lastPart = totalClientsText.split("/")[1].trim();

        String[] substrings = totalClientsText.split(" ");
        String lastPart = substrings[substrings.length - 1];

        System.out.println("Total Clients: " + lastPart);
    }
}
