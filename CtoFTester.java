//the functions should have a single double representing temperature as the parameter
//the functions should return a double representing the converted temperature

public class CtoFTester {
  public static double celsiusToFahrenheit(double C) {
    double F = C * 1.8 + 32;
    return F;
  }

  public static double fahrenheitToCelsius(double F) {
    double C = (F - 32) * 5/9;
    return C;
  }

  public static void main(String[] wheeeeeee) {
    //test cases
    System.out.print("celsiusToFahrenheit(50) should return 122. It returns: ");
    System.out.println(celsiusToFahrenheit(50));
    System.out.print("fahrenheitToCelsius(113) should return 45. It returns: ");
    System.out.println(fahrenheitToCelsius(113));
  }
}
