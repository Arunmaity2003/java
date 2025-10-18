
import java.util.Scanner;

class elementFoundOrNot {

    static boolean elementFoundOrNot(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter the numbers (4)");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the number you want to find: ");
        int num = in.nextInt();

        System.out.println(elementFoundOrNot(arr, num));
    }
}
