package contants;

import org.openqa.selenium.By;

public class objectRepo
{
    public static By toolbar=By.id("io.plaidapp:id/toolbar");
    //Main Menu
    public static By buttonSearch=By.id("io.plaidapp:id/menu_search");
    public static By buttonTheme=By.id("io.plaidapp:id/menu_theme");
    public static By buttonMenuFilter=By.id("io.plaidapp:id/menu_filter");
    public static By buttonMoreOptions=By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");

    //More Options
    public static  By buttonLoginToDesigner=By.xpath("//*[contains(text(),'Log in to Designer News')]");
    public static  By buttonMoreAbout=By.xpath("//*[contains(text(),'About')]");

    //Menu Filter
    public static  By buttonPopularDesign=By.xpath("//*[contains(text(),'Popular Designer News')]");
    public static  By buttonMaterialDesign=By.xpath("//*[contains(text(),'“Material Design”')]");
    public static By  buttonProductHunt=By.xpath("//*[contains(text(),'Product Hunt')]");




}
