package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
  private static final String PAGE_TITLE = "Swag Labs";

  private final By Txt_title = By.xpath("//*[@id='root']/div/div[1]");
  private final By TxtBox_username = By.xpath("//*[@id='user-name']");
  private final By TxtBox_password = By.xpath("//*[@id='password']");
  private final By Btn_login = By.xpath("//*[@id='login-button']");

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public void verifyTitle() {
    super.verifyTitle(PAGE_TITLE, Txt_title, 10);
  }

  public void login(String username, String password) {
    super.enterText(TxtBox_username, username);
    super.enterText(TxtBox_password, password);
    super.click(Btn_login);
  }
}
