package utility;

import org.openqa.selenium.WebDriver;

public class ProductHelper {
  private final WebDriver driver;

  public ProductHelper(WebDriver driver) {
    this.driver = driver;
  }

  public enum AddToCartOption {
    YES("Y"),
    NO("N");

    private final String value;

    AddToCartOption(String value) {
      this.value = value;
    }

    public static AddToCartOption fromString(String value) {
      for (AddToCartOption option : AddToCartOption.values()) {
        if (option.value.equalsIgnoreCase(value)) {
          return option;
        }
      }
      throw new IllegalArgumentException("Invalid AddToCart option: " + value);
    }
  }
}
