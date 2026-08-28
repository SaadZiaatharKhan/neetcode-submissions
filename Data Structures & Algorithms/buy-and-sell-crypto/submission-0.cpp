class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int l = 0;              // buy day
        int r = 1;              // sell day
        int maxProfit = 0;

        while (r < prices.size()) {
            if (prices[r] > prices[l]) {
                int profit = prices[r] - prices[l];
                maxProfit = max(maxProfit, profit);
            } else {
                // found smaller price, better to buy here
                l = r;
            }
            r++;
        }

        return maxProfit;
    }
};