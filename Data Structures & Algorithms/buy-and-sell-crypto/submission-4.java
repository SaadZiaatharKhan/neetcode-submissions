class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        if (prices.length == 1) return 0;
        int i = 0, j = 1, ans = 0;
        while (j < prices.length) {
            if (prices[j] > prices[i]) {
                ans = Math.max(ans, prices[j] - prices[i]);
            } else {
                i = j;
            }
            j++; 
        }
        return ans;
    }
}
