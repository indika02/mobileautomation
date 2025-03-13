package Stepdefinitions;

import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.net.MalformedURLException;

public class loginPageSteps {

    private loginPage loginPage=new loginPage(null);

    @Given("Load the App")
    public void load_the_app() throws MalformedURLException {
        loginPage.loadApp();
    }

    @Then("Click Search Icon")
    public void click_search_icon() {
        loginPage.clickSearchIcon();
    }

    @Then("^Enter the text as (.*)$")
    public void enter_the_text(String text) {
        loginPage.searchText(text);
    }

}
