package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
  private static final String PAGE_TITLE = "Your Cart";

  private final By Txt_title = By.xpath("//*[@id='header_container']/div[2]/span");
  private final By Btn_Checkout = By.xpath("//*[@id='checkout']");

  public CartPage(WebDriver driver) {
    super(driver);
  }

  public void verifyTitle() {
    super.verifyTitle(PAGE_TITLE, Txt_title, 10);
  }

  public void clickCheckout() {
    super.click(Btn_Checkout);
  }
}
