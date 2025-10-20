
class MaxWealth {

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account1 : accounts) {
            int sum = 0;
            for (int account = 0; account < account1.length; account++) {
                sum += account1[account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {2, 41, 6},
            {7, 8, 9, 0}
        };

        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
}
