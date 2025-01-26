package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.RandomGenerator;

public class CheckoutPage extends BasePage {
  private static final String PAGE_TITLE = "Checkout: Your Information";
  private static final String ORDER_COMPLETED = "Thank you for your order!";

  private final By Txt_title = By.xpath("//*[@id='header_container']/div[2]/span");
  private final By TxtBox_FirstName = By.xpath("//*[@id='first-name']");
  private final By TxtBox_LastName = By.xpath("//*[@id='last-name']");
  private final By TxtBox_PostalCode = By.xpath("//*[@id='postal-code']");
  private final By Btn_Continue = By.xpath("//*[@id='continue']");
  private final By TxtBox_PriceTotal = By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[6]");
  private final By Txt_OrderCompletedInfo = By.xpath("//*[@id='checkout_complete_container']/h2");
  private final By Btn_Finish = By.xpath("//*[@id='finish']");

  public CheckoutPage(WebDriver driver) {
    super(driver);
  }

  public void verifyTitle() {
    super.verifyTitle(PAGE_TITLE, Txt_title, 10);
  }

  public void enterPersonalInfo() {
    super.enterText(TxtBox_FirstName, RandomGenerator.getRandomString(5, RandomGenerator.StringType.ALPHABETIC));
    super.enterText(TxtBox_LastName, RandomGenerator.getRandomString(5, RandomGenerator.StringType.ALPHABETIC));
    super.enterText(TxtBox_PostalCode, RandomGenerator.getRandomString(5, RandomGenerator.StringType.NUMERIC));
  }

  public void clickContinue() {
    super.click(Btn_Continue);
  }

  public void clickFinish() {
    super.click(Btn_Finish);
  }

  public void verifyOrderCompleteInfo() {
    super.verifyTitle(ORDER_COMPLETED, Txt_OrderCompletedInfo, 10);
  }

  public String getTotalPrice() {
    return driver.findElement(TxtBox_PriceTotal)
      .getText()
      .replace("Item total: ", "")
      .trim();
  }
}
