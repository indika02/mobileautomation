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
    private By emailTextBox = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)");
    private By pwdTxtBox=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)");
    private By loginBtn=By.xpath("//android.widget.Button[@content-desc=\"Log in\"]/android.view.ViewGroup");
    private By saveLoginInfoBtn=AppiumBy.androidUIAutomator("new UiSelector().description(\"OK\")");
    private By loginErrorMsg=AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/message\")");
    private By blankSpace=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(5)");
    private By forgotPwdLink=AppiumBy.androidUIAutomator("new UiSelector().text(\"Forgot password?\")");
    private By forgotPwdPageHeader=new AppiumBy.ByAccessibilityId("Find your account");
    private By forgotPwdPageAlertAccept=AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/button1\")");

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

    public void enter_Email(String email){
        waitTime(driver,emailTextBox);
        type(driver,emailTextBox,email);
        click(driver,blankSpace);
    }

    public void enter_Pwd(String pwd) {
        waitTime(driver, pwdTxtBox);
        type(driver, pwdTxtBox, pwd);

    }

    public void click_Login(){
        waitTime(driver,loginBtn);
        click(driver,loginBtn);
    }

    public void saveLoginInfo(){
        waitTime(driver,saveLoginInfoBtn);
        click(driver,saveLoginInfoBtn);
    }

    public void verifyLoginErrorMsg(String message){
        waitTime(driver,loginErrorMsg);
        verifyText(driver,loginErrorMsg,message);
    }

    public void clickForgotPwdLink(){
        waitTime(driver,forgotPwdLink);
        click(driver,forgotPwdLink);
    }


}
