class Solution {

    private boolean doesExceeds (int[] piles, int mid, int h) {
        int maxHours = 0;
        for (int num : piles) {
            maxHours = maxHours + ((num + mid - 1) / mid);
        }
        if (maxHours > h) return true;
        return false;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        for (int num : piles) {
            high = Math.max(high, num);
        }
        int ans = Integer.MIN_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (doesExceeds(piles, mid, h)) low = mid + 1;
            else {
                high = mid - 1;
                ans = mid;
            }
        }

        return ans;
    }
}
