
import java.util.Arrays;
import java.util.Scanner;

public class simpleArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(in.nextInt());
        }
        // int[] arr = {2, 5, 6, 9};
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        System.out.println(Arrays.toString(arr));
    }
}
