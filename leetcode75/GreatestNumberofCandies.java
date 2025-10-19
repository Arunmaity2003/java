
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GreatestNumberofCandies {

    public static List<Boolean> kidsCandy(int[] candy, int exCandy) {
        int max = Arrays.stream(candy).max().getAsInt();
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candy.length; i++) {
            result.add(candy[i] + exCandy >= max);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candy = {5, 8, 9, 1};
        int exCandy = 2;
        System.out.println(kidsCandy(candy, exCandy));
    }
}
