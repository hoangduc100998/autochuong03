package AutomationWebFramework.ThucHanh1.Actions.pageObjects;

import AutomationWebFramework.ThucHanh1.Interfaces.ClientDetailPageUI;
import AutomationWebFramework.ThucHanh1.Actions.commons.BasePage;
import AutomationWebFramework.ThucHanh1.Interfaces.ClientPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientDetailPageObjects {
    //private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static String getTotalClientOnList (WebDriver driver) throws InterruptedException {
        basePage.clickToElement(driver, ClientDetailPageUI.Clients);
        //Thread.sleep(5000);

        //Chờ số total client hiển thị thay cho dùng thread
        basePage.waitForElementVisible(driver, ClientDetailPageUI.Total_Clients );
        //basePage.scrollToBottomPage(driver);
        //Thread.sleep(5000);
        String totalClientsText = basePage.getElementText(driver, ClientDetailPageUI.Total_Clients);
        //1-10 / 51 : Thì mình chỉ lấy số 51 nên chọn là [1] . trim là bỏ những kí tự trống, space, lấy mỗi số thôi
        //String lastPart = totalClientsText.split("/")[1].trim();

        String[] substrings = totalClientsText.split(" ");
        String lastPart = substrings[substrings.length - 1];

        //System.out.println("Total Detail: " + lastPart);
        return lastPart;
    }
}
