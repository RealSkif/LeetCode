public class SellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{2,4,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int min = 10000;
        int max = prices[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
                minIndex = i;
            }
            if (max < prices[i ]) {
                max = prices[i ];
                maxIndex = i;
            }
        }
        if (max == prices[0] && min == prices[prices.length-1] || minIndex > maxIndex)
            return 0;
        else
            return max - min;
    }
}
