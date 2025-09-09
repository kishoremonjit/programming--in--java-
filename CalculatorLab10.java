class CalculatorLab10 {

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply two double values
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Multiplication of integers
        int intResult = calc.multiply(5, 10);
        System.out.println("Multiplication of integers: " + intResult);

        // Multiplication of doubles
        double doubleResult = calc.multiply(5.5, 2.0);
        System.out.println("Multiplication of doubles: " + doubleResult);
    }
}
