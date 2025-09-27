class SecondLargest {
    static int secLarge(int[] arr) {
        if (arr.length < 2) return -1; // Not enough elements

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second; 
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7, 8, 9};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {5, 5, 4};

        System.out.println(secLarge(arr1)); // 8
        System.out.println(secLarge(arr2)); // -1 (no second largest)
        System.out.println(secLarge(arr3)); // 4
    }
}
