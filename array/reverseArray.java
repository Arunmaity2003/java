
import java.util.Arrays;
import java.util.Scanner;

class reverseArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // Reverse array
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Print reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
