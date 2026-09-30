class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) return 0;
        int ans = 0, left = 0, right = 1;
        while (right < prices.length) {
            if (prices[right] < prices[left]) left = right;
            ans = Math.max(ans, prices[right] - prices[left]);
            right++;
        }
        return ans;
    }
}
