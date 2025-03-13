package Pages;

import Common.actionCommands;
import Common.appSetup;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class loginPage extends actionCommands {

    private AndroidDriver driver;
    private appSetup appSetup;
    private By searchIcon= new AppiumBy.ByAccessibilityId("Search");
    private By searchBox= By.id("android:id/search_src_text");

    public loginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loadApp() throws MalformedURLException {
        appSetup=new appSetup();
        appSetup.setUp();
        this.driver=appSetup.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickSearchIcon(){
        click(driver, searchIcon);
    }

    public void searchText(String text){
        type(driver, searchBox, text);
    }
}
