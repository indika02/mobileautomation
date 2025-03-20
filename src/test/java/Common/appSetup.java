package Common;

import Pages.loginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class appSetup {

    private AndroidDriver driver;
    private loginPage loginPage;
    public appSetup() {

    }
    public void setUp() throws MalformedURLException {
        configDataProvider config = new configDataProvider();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(config.getPlatformName());
        options.setUdid(config.getudId());
        options.setAutomationName(config.getautomationName());
        options.setPlatformVersion(config.getplatformVersion());
        options.setDeviceName(config.getdeviceName());
        options.setAutoGrantPermissions(true);
        options.setApp(new File(config.getApp()).getAbsolutePath());
        driver = new AndroidDriver(new URL(config.getURL()), options);
        loginPage = new loginPage(driver);

    }
    public AndroidDriver getDriver() {
        return driver;
    }
}
