package context;

public class TestContext {
  private static final ThreadLocal<Double> totalPrice = ThreadLocal.withInitial(() -> 0.0);

  public static double getTotalPrice() {
    return totalPrice.get();
  }

  public static void addToTotalPrice(double price) {
    totalPrice.set(totalPrice.get() + price);
  }

  public static void resetTotalPrice() {
    totalPrice.set(0.0);
  }
}
