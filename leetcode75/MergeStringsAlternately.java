
import java.util.Scanner;

class MergeStringsAlternately {

    public static String mrgStrAlt(String w1, String w2) {
        int n = w1.length();
        int m = w2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < n || i < m) {
            if (i < n) {
                sb.append(w1.charAt(i));
            }
            if (i < m) {
                sb.append(w2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first Word: ");
        String w1 = in.next();
        System.out.println("Enter the second Word: ");
        String w2 = in.next();
        System.out.println("the output is: " + mrgStrAlt(w1, w2));
    }
}
