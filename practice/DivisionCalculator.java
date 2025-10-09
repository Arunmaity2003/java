// Create a simple program that demonstrates try-catch-finally in Java:

// Requirements:
// Create a class DivisionCalculator.
// Inside it, write a method divide(int a, int b) that:
// Tries to divide a by b.
// Catches ArithmeticException if division by zero occurs and prints a message.
// Uses a finally block to print "Operation completed".
// In main(), call divide() twice:
// Once with valid numbers.
// Once with b = 0 to trigger the exception.
class DivisionCalculator {

    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("result "+result);
        } catch (ArithmeticException e) {
            if (b == 0) {
                System.out.println("Please provide  valid number");
            }
        } finally {
            System.out.println("operation completed");
        }
    }

    public static void main(String[] args) {
        DivisionCalculator d = new DivisionCalculator();
        d.divide(4, 2);
        d.divide(2, 0);
    }

}
