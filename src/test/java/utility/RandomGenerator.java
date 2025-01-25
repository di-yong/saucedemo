package utility;

public class RandomGenerator {
  public enum StringType {
    NUMERIC,
    ALPHANUMERIC,
    ALPHABETIC
  }

  public static String getRandomString(int length, StringType type) {
    String characters = "";

    switch (type) {
      case NUMERIC:
        characters = "0123456789";
        break;
      case ALPHANUMERIC:
        characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
        break;
      case ALPHABETIC:
        characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
        break;
    }

    StringBuilder sb = new StringBuilder(length);

    for (int i = 0; i < length; i++) {
      int index = (int) (characters.length() * Math.random());
      sb.append(characters.charAt(index));
    }
    return sb.toString();
  }
}
