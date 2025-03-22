package Stepdefinitions;

import Common.appSetup;
import Pages.dashboardPage;
import Pages.loginPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;


public class dashboardPageSteps {

    private AndroidDriver driver;
    private Pages.dashboardPage dashboardPage=new dashboardPage(appSetup.getDriver());


    @Then("Click the search icon")
    public void click_the_search_icon() {
        dashboardPage.clickSearchIcon();
    }

    @Then("^Enter the user's name as (.*)$")
    public void enter_the_user_name_as(String userName) {
        dashboardPage.enterUname(userName);
    }

    @Then("Click on the friends tab")
    public void click_on_the_friends_tab() {
        dashboardPage.clickFriendsTab();
    }

    @Then("^Verify the tab title as (.*)$")
    public void verify_the_tab_title_as(String title) {
        dashboardPage.verifyTabTitle(title);
    }

}
