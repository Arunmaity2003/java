import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two string inputs
        System.out.print("Enter first string (s): ");
        String s = scanner.nextLine();

        System.out.print("Enter second string (t): ");
        String t = scanner.nextLine();

        // Check if lengths are same
        if (s.length() != t.length()) {
            System.out.println("Strings must be of equal length.");
            return;
        }

        // Create a HashMap to store key-value character mapping
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);

            map.put(key, value); // stores key → value mapping
        }

        // Print the stored key-value pairs
        System.out.println("Character Mappings:");
        for (Character key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }
    }
}
