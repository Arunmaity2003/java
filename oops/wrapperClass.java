
import java.util.ArrayList;

public class wrapperClass {
    public static void main(String[] args) {
        int a = 10;

        // Boxing (manual conversion)
        Integer obj1 = Integer.valueOf(a);

        // Autoboxing (automatic conversion by compiler)
        Integer obj2 = a;

        System.out.println(obj1);
        System.out.println(obj2);



         // ArrayList does not support primitive types
        ArrayList<Integer> list = new ArrayList<>();

        // Autoboxing: int → Integer
        list.add(5);
        list.add(10);

        // Auto-unboxing: Integer → int
        int num = list.get(0);

        System.out.println(list);  // [5, 10]
        System.out.println(num);   // 5
    }
}
