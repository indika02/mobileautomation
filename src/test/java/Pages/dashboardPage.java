package Pages;

import Common.actionCommands;
import Common.appSetup;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage extends actionCommands {

    private AndroidDriver driver;
    private By searchIcon= AppiumBy.androidUIAutomator("new UiSelector().description(\"\uE002\")");
    private By searchBox=new AppiumBy.ByAccessibilityId("Search...");
    private By friendTabIcon=AppiumBy.androidUIAutomator("new UiSelector().description(\"\uE005\")");
    private By friendsTabTitle=new AppiumBy.ByAccessibilityId("Friends");
    private By story=AppiumBy.xpath("//android.widget.Button[contains(@content-desc, '1 Unseen story')]");

    public dashboardPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSearchIcon() {
        waitTime(driver,searchIcon);
        click(driver,searchIcon);
    }

    public void enterUname(String uname){
        waitTime(driver,searchBox);
        type(driver,searchBox,uname);
        clickEnter(driver,searchBox);
    }

    public void verifyTabTitle(String title){
        waitTime(driver,friendsTabTitle);
        verifyTextAvailability(driver,friendsTabTitle,title);
    }

    public void clickFriendsTab(){
        waitTime(driver,friendTabIcon);
        click(driver,friendTabIcon);
    }

    public void swipeStories(){
        waitTime(driver,story);
        swipeFacebookStory(driver,story);
    }

    public void viewStory(){
        waitTime(driver,story);
        click(driver,story);
    }
}
