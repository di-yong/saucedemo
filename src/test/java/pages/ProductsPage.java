package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
  private static final String PAGE_TITLE = "Products";

  private final By Txt_title = By.xpath("//*[@id='header_container']/div[2]/span");
  private final By Img_Cart = By.xpath("//*[@id='shopping_cart_container']/a");

  public ProductsPage(WebDriver driver) {
    super(driver);
  }

  public void verifyTitle() {
    super.verifyTitle(PAGE_TITLE, Txt_title, 10);
  }

  public void clickAddToCart(String itemName) {
    String addToCartButtonXpath = "//div[normalize-space(text())='" + itemName +
      "']/ancestor::div[@class='inventory_item']//button[contains(@class, 'btn_inventory')]";

    if (eh.isElementPresent(By.xpath(addToCartButtonXpath))) {
      super.click(By.xpath(addToCartButtonXpath));
    } else {
      throw new RuntimeException("Add to cart button for " + itemName + " not found");
    }
  }

  public void clickCart() {
    super.click(Img_Cart);
  }
}
