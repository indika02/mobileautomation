package Common;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

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


}
