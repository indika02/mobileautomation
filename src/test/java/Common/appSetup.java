package Common;

import Pages.loginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class appSetup {

    private AndroidDriver driver;
    private loginPage loginPage;

    public appSetup() {

    }
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setUdid("emulator-5554");
        options.setAutomationName("UiAutomator2");
        options.setPlatformVersion("15.0");
        options.setDeviceName("Android Emulator");
        options.setApp(new File("apps/testapk1.apk").getAbsolutePath());
        driver = new AndroidDriver(new URL("http://localhost:4723/"), options);
        loginPage = new loginPage(driver);
    }

    public AndroidDriver getDriver() {
        return driver;
    }
}
