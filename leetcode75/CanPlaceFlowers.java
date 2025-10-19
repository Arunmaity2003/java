
class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            // Check if current plot is empty
            if (flowerbed[i] == 0) {
                // Check neighbors (or edges)
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == length - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Plant flower
                    count++;
                }
            }
        }

        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowers = {0, 0, 1, 0, 1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowers, n));
    }
}
