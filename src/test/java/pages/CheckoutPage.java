package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ElementHelper;
import utility.Hooks;

import static org.testng.AssertJUnit.assertEquals;

public class CheckoutPage {
  private final WebDriver driver;
  private final ElementHelper eh;

  private final By Txt_title = By.xpath("//*[@id='header_container']/div[2]/span");
  private final By TxtBox_FirstName = By.xpath("//*[@id='first-name']");
  private final By TxtBox_LastName = By.xpath("//*[@id='last-name']");
  private final By TxtBox_PostalCode = By.xpath("//*[@id='postal-code']");
  private final By Btn_Continue = By.xpath("//*[@id='continue']");
  private final By TxtBox_PriceTotal = By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[6]");
  private final By Txt_OrderCompletedInfo = By.xpath("//*[@id='checkout_complete_container']/h2");


  private final By Btn_Finish = By.xpath("//*[@id='finish']");

  public CheckoutPage(WebDriver driver) {
    this.driver = driver;
    this.eh = new ElementHelper(driver);
  }

  public void verifyTitle() {
    assertEquals("Checkout: Your Information", eh.getElementTextWhenVisible(Txt_title, 10));
  }

  public void enterPersonalInfo() {
    driver.findElement(TxtBox_FirstName).sendKeys("qwe");
    driver.findElement(TxtBox_LastName).sendKeys("ewq");
    driver.findElement(TxtBox_PostalCode).sendKeys("1001");
  }

  public void clickContinue() {
    driver.findElement(Btn_Continue).click();
  }

//  public void verifyTotalPrice() {
//    assertEquals("ass".contains("29.99"), eh.getElementTextWhenVisible(TxtBox_PriceTotal, 10));
//
//  }

  public void clickFinish() {
    driver.findElement(Btn_Finish).click();
  }

  public void verifyOrderCompleteInfo() {
    assertEquals("Thank you for your order!", eh.getElementTextWhenVisible(Txt_OrderCompletedInfo, 10));
  }
}
