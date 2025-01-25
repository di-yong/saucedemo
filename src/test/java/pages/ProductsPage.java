package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.ElementHelper;

import java.util.List;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;

public class ProductsPage {
  private final WebDriver driver;
  private final ElementHelper eh;

  private final By Txt_title = By.xpath("//*[@id='header_container']/div[2]/span");
  private final By Btn_Sauce_Labs_Backpack = By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']");
  private final By Img_Cart = By.xpath("//*[@id='shopping_cart_container']/a");

  public ProductsPage(WebDriver driver) {
    this.driver = driver;
    this.eh = new ElementHelper(driver);
  }

  public void verifyTitle() {
    assertEquals("Products", eh.getElementTextWhenVisible(Txt_title, 10));
  }

  public void clickAddToCart() {
    driver.findElement(Btn_Sauce_Labs_Backpack).click();
  }

  public void clickCart() {
    driver.findElement(Img_Cart).click();

  }
}
