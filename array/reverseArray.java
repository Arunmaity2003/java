
import java.util.Arrays;

class reverseArray {

    static int[] reverse(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}