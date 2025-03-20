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

    @Then("^Enter the email as (.*)$")
    public void enter_the_email_as(String email) {
        loginPage.enter_Email(email);
    }

    @Then("^Enter the Password as (.*)$")
    public void enter_the_Password_as(String password) {
        loginPage.enter_Pwd(password);
    }

    @Then("^Click Login button")
    public void click_Login_button() {
        loginPage.click_Login();
    }

    @Then("Click Ok for save the login info")
    public void click_Ok_for_save_the_login_info() {
        loginPage.saveLoginInfo();
    }
}
