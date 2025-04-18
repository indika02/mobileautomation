package Stepdefinitions;

import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;

public class loginPageSteps {

    private static final Logger log = LoggerFactory.getLogger(loginPageSteps.class);
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

    @Then("^Verify the error message as (.*)$")
    public void verify_error_message_as(String message) {
        loginPage.verifyLoginErrorMsg(message);
    }

    @Then("Click the Forgot password link")
    public void click_the_Forgot_password_link() {
        loginPage.clickForgotPwdLink();
    }

    @Then("Close the App")
    public void close_app(){
        loginPage.closeApp();
    }

}
