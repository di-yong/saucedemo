package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class LoginPage {
  private final WebDriver driver;

  private final By Txt_title = By.xpath("//*[@id='root']/div/div[1]");
  private final By TxtBox_username = By.xpath("//*[@id='user-name']");
  private final By TxtBox_password = By.xpath("//*[@id='password']");
  private final By Btn_login = By.xpath("//*[@id='login-button']");

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public void verifyTitle() {
    assertEquals("Swag Labs", driver.findElement(Txt_title).getText());
  }
  public void enterUsername() {
    driver.findElement(TxtBox_username).sendKeys("standard_user");
  }

  public void enterPassword() {
    driver.findElement(TxtBox_password).sendKeys("secret_sauce");
  }

  public void clickLoginButton() {
    driver.findElement(Btn_login).click();
  }
}
