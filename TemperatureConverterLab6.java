import java.util.Scanner;

class TemperatureConverterLab6 {

    // Convert Celsius to Fahrenheit
    double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    // Convert Fahrenheit to Celsius
    double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureConverterLab6 tc = new TemperatureConverterLab6(); // Corrected class name

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println("In Fahrenheit: " + tc.celsiusToFahrenheit(c));

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("In Celsius: " + tc.fahrenheitToCelsius(f));
    }
}
