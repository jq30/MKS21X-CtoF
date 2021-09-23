//the functions should have a single double representing temperature as the parameter
//the functions should return a double representing the converted temperature

public class CtoFTester {
  public static double celsiusToFahrenheit(double C) {
    double F = C * 1.8 - 32;
    return F;
  }

  public static double fahrenheitToCelsius(double F) {
    double C = (F - 32) * 5/9;
    return C;
  }
}
