package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ElementHelper;

import static org.testng.AssertJUnit.assertEquals;

public class ProductsPage {
  private final WebDriver driver;
  private final ElementHelper eh;

  private final By Txt_title = By.xpath("//*[@id='header_container']/div[2]/span");
  private final By Img_Cart = By.xpath("//*[@id='shopping_cart_container']/a");

  public ProductsPage(WebDriver driver) {
    this.driver = driver;
    this.eh = new ElementHelper(driver);
  }

  public void verifyTitle() {
    assertEquals("Products", eh.getElementTextWhenVisible(Txt_title, 10));
  }

  public void clickAddToCart(String itemName) {
    String addToCartButtonXpath = "//div[normalize-space(text())='" + itemName +
      "']/ancestor::div[@class='inventory_item']//button[contains(@class, 'btn_inventory')]";
    driver.findElement(By.xpath(addToCartButtonXpath)).click();
  }

  public void clickCart() {
    driver.findElement(Img_Cart).click();
  }
}
