
import java.util.Scanner;

class NumberOfEvenDigits {

    public static int digitCount(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numOfDigit = digits(num);
        return numOfDigit % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int ans = digitCount(arr);
        System.out.println(ans);
    }
}
