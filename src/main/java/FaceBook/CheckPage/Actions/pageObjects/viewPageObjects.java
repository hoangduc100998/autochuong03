package FaceBook.CheckPage.Actions.pageObjects;

import FaceBook.CheckPage.Actions.commons.BasePage;
import FaceBook.CheckPage.Interfaces.LoginPageUI;
import FaceBook.CheckPage.Interfaces.viewPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

//import static FaceBook.CheckPage.Interfaces.viewPageUI.friends_txt;

public class viewPageObjects {
    private static BasePage basePage = new BasePage();

    public static void viewPage (WebDriver driver) throws InterruptedException {
        //B1. Mở 1 link mới
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/profile.php?id=61554976131100");
        Thread.sleep(500);

        //B2. Tắt thông báo của Chrome đi mới chạy - Chưa tắt được (Alert)


        //B3. Chuyển page
        basePage.clickToElement(driver, viewPageUI.changePage_txt);
        Thread.sleep(10000);

        //B4. SETTING
        basePage.clickToElement(driver, viewPageUI.setting_txt);
        Thread.sleep(10000);
        basePage.clickToElement(driver, viewPageUI.traiNghiem_txt);
        basePage.clickToElement(driver, viewPageUI.deXuatTrang_txt);
        basePage.getElementText(driver,viewPageUI.trangThaiTrang_txt);
        String tenTrang = basePage.getElementText(driver, viewPageUI.tenTrang_txt);
        String chatLuongPage = basePage.getElementText(driver, viewPageUI.trangThaiTrang_txt);
        System.out.println(tenTrang + ": " + chatLuongPage);
    }
}

//Đăng 1 ảnh lên trang cá nhân
//Lây được text Đề Xuất Trang
//in ra file excel
//logout tài khoản
//tiếp tục đăng nhập tài khoản khác đến khi hết

//https://www.facebook.com/NW.amtm/

        //B1. Mở link bằng file excel
        //basePage.sendKeyToElement(driver, viewPageUI.Username_txt,username);

//        basePage.checkToCheckboxRadio(driver, friends_txt);
//        String check = basePage.getElementText(driver, friends_txt);
//        System.out.println("Check duoc chu: " + check);

