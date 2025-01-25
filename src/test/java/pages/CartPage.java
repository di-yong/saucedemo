package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ElementHelper;

import static org.testng.AssertJUnit.assertEquals;

public class CartPage {
  private final WebDriver driver;
  private final ElementHelper eh;

  private final By Txt_title = By.xpath("//*[@id='header_container']/div[2]/span");
  private final By Btn_Checkout = By.xpath("//*[@id='checkout']");

  public CartPage(WebDriver driver) {
    this.driver = driver;
    this.eh = new ElementHelper(driver);
  }

  public void verifyTitle() {
    assertEquals("Your Cart", eh.getElementTextWhenVisible(Txt_title, 10));
  }

  public void clickCheckout() {
    driver.findElement(Btn_Checkout).click();

  }
}
