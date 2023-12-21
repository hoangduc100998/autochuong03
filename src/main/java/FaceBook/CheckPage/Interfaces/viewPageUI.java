package FaceBook.CheckPage.Interfaces;

public class viewPageUI {
    //Check coi Login thành công chưa rồi mới search Link bằng cách xem hiện bạn bè chưa
//    public static String friends_txt = "";

    //B3. Bắt xpath chuyển page
    public static String changePage_txt = "//div[@class='x9f619 x193iq5w x1talbiv x1sltb1f x3fxtfs x1swvt13 x1pi30zi']//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs xlh3980 xvmahel x1n0sxbx x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x4zkp8e x3x7a5m x6prxxf xvq8zen x1s688f xtk6v10']//span[1]";
    //B4. SETTING
    public static String setting_txt = "//div[5]//span[1]//div[1]//a[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//span[1]";
    //b5. Trai nghiem trang moi
    public static String traiNghiem_txt = "//a[@href='https://www.facebook.com/settings?tab=profile_access']//div[@class='x6s0dn4 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1q0g3np x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r xeuugli x18d9i69 x1sxyh0 xurb0ha xexx8yu x1n2onr6 x1ja2u2z x1gg8mnh']//div[@class='x78zum5 xdt5ytf xq8finb x1xmf6yo x1e56ztr x1n2onr6 xqcrz7y']//img[@class='x1b0d499']";
    //b6. De xuat Trang
    public static String deXuatTrang_txt = "//a[@href='https://www.facebook.com/settings?tab=profile_recommendations']//div[@class='x6s0dn4 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1q0g3np x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r xeuugli x18d9i69 x1sxyh0 xurb0ha xexx8yu x1n2onr6 x1ja2u2z x1gg8mnh']//div[@class='x6s0dn4 xkh2ocl x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1q0g3np x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli x18d9i69 x4uap5 xkhd6sd xexx8yu x1n2onr6 x1ja2u2z']";
    public static String tenTrang_txt = "//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs xlh3980 xvmahel x1n0sxbx x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x4zkp8e x676frb x1nxh6w3 x1sibtaa x1s688f xi81zsa x1yc453h']";
    public static String trangThaiTrang_txt = "//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs xlh3980 xvmahel x1n0sxbx x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xtoi2st x41vudc xngnso2 x1qb5hxa x1xlr1w8 xzsf02u x1yc453h'][contains(text(),'Đề xuất Trang')]";

}
