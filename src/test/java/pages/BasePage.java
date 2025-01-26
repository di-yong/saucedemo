package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ElementHelper;

import static org.testng.AssertJUnit.assertEquals;

public class BasePage {
  protected final WebDriver driver;
  protected final ElementHelper eh;

  public BasePage(WebDriver driver) {
    this.driver = driver;
    this.eh = new ElementHelper(driver);
  }

  public void enterText(By locator, String text) {
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(text);
  }

  public void click(By locator) {
    driver.findElement(locator).click();
  }

  public void verifyTitle(String expectedTitle, By titleLocator, int timeoutInSeconds) {
    try {
      String actualTitle = eh.getElementTextWhenVisible(titleLocator, timeoutInSeconds);
      assertEquals("Title mismatch!", expectedTitle, actualTitle);
    } catch (Exception e) {
      throw new AssertionError("Failed to verify title. Expected: " + expectedTitle + ", Error: " + e.getMessage());
    }
  }
}