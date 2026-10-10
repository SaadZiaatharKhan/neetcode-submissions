class Solution {
    public int maxSubArray(int[] nums) {
        int n =nums.length;

        int maxsum=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<n; i++){
            sum=Math.max(nums[i],sum+nums[i]);
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}