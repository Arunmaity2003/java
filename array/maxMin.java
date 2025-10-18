
import java.util.Scanner;

class maxMin {

    static void maxmin(int[] arr) {
        int minimum = arr[0];
        int maximum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        System.out.println("the max is : " + maximum);
        System.out.println("the min is : " + minimum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter the 5 elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        maxmin(arr);

    }
}
