package pages;

import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ElementHelper;

import static org.testng.AssertJUnit.assertEquals;

public class LoginPage {
  private final WebDriver driver;
  private final ElementHelper eh;

  private final By Txt_title = By.xpath("//*[@id='root']/div/div[1]");
  private final By TxtBox_username = By.xpath("//*[@id='user-name']");
  private final By TxtBox_password = By.xpath("//*[@id='password']");
  private final By Btn_login = By.xpath("//*[@id='login-button']");

  public LoginPage(WebDriver driver) {
    this.driver = driver;
    this.eh = new ElementHelper(driver);
  }

  public void verifyTitle() {
    assertEquals("Swag Labs", eh.getElementTextWhenVisible(Txt_title, 10));
  }

  public void enterUsername(String username) {
    driver.findElement(TxtBox_username).sendKeys(username);
  }

  public void enterPassword(String password) {
    driver.findElement(TxtBox_password).sendKeys(password);
  }

  public void clickLoginButton() {
    driver.findElement(Btn_login).click();
  }

  public void login(String username, String password) {
    enterUsername(username);
    enterPassword(password);
    clickLoginButton();
  }
}
