package context;

public class TestContext {
  public static double totalPrice = 0.0;

  public static double getTotalPrice() {
    return totalPrice;
  }

  public static void addToTotalPrice(double price) {
    totalPrice += price;
  }

  public static void resetTotalPrice() {
    totalPrice = 0.0;
  }
}
