import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class FirstAndroidTest {

    AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setPlatformVersion("7.0");
        options.setDeviceName("Android Emulator");
        options.setApp(new File("apps/testapk1.apk").getAbsolutePath());

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
    }


    @Test
    public void clickAppButton() {
        WebElement element=driver.findElement(new AppiumBy.ByAccessibilityId("Search"));
        element.click();
        driver.findElement(By.id("android:id/search_src_text")).sendKeys("indika");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
