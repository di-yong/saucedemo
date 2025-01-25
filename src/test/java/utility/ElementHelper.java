package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utility.Hooks.getDriver;

public class ElementHelper {
  private final WebDriver driver;

  public ElementHelper(WebDriver driver) {
    this.driver = driver;
  }

  public String getElementTextWhenVisible(By locator, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
    try {
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
      return element.getText();
    } catch (TimeoutException e) {
      System.out.println("Element was not visible within the timeout period.");
      return "";
    }
  }
}
