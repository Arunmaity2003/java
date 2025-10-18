
import java.util.Scanner;

class sumOfAllElement {

    static int sumAllElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[3];
        System.out.print("Enter the 3 elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int ans = sumAllElement(arr);
        System.out.println("the sum of all elements is: " + ans);
    }
}
