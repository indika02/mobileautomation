package Common;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Collections;

public class actionCommands {

    protected void click(AppiumDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    protected void type(AppiumDriver driver, By locator, String input) {
        try {
            WebElement element = driver.findElement(locator);
            element.sendKeys(input);
        } catch (NoSuchElementException e) {
            System.out.println("No such a element " + e.getMessage());
            throw e;
        }
    }

    protected void waitTime(AppiumDriver driver, By locator) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void clickEnter(AppiumDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(Keys.ENTER);
    }

    protected void verifyTextAvailability(AppiumDriver driver, By locator, String text) {
        WebElement element = driver.findElement(locator);
        Assert.assertEquals(element.getDomAttribute("content-desc"), text);
    }

    protected void verifyText(AppiumDriver driver,By locator, String text){
        WebElement element=driver.findElement(locator);
        Assert.assertEquals(element.getText(), text);
    }

    protected void ignoreNotifications(AppiumDriver driver){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void swipeFacebookStory(AppiumDriver driver,By locator) {

        WebElement stories = driver.findElement(locator);
        int startX = stories.getLocation().getX() + (int) (stories.getSize().width * 0.8);
        int endX = stories.getLocation().getX() + (int) (stories.getSize().width * 0.2);
        int startY = stories.getLocation().getY() + (stories.getSize().height / 2);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(50), PointerInput.Origin.viewport(), endX, startY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipe));
    }

    public void swipeNotification(AppiumDriver driver,By locator) {
        WebElement element = driver.findElement(locator);

        // Get element's position and size
        int centerX = element.getLocation().getX() + (element.getSize().width / 2);
        int startY = element.getLocation().getY() + (int) (element.getSize().height * 0.8); // Start near the bottom
        int endY = element.getLocation().getY() + (int) (element.getSize().height * 0.2);  // End near the top

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 100)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX, startY)) // Start at bottom
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(500))) // Pause for realism
                .addAction(finger.createPointerMove(Duration.ofMillis(10000), PointerInput.Origin.viewport(), centerX, endY)) // Move to top
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(swipe));
    }

}
