package oops.exceptionhandling;

class main {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("It will always shown");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Plese dont divide it by 0");
        }
        return a / b;
    }
}
