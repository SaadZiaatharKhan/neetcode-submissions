class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {set.add(n);}
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int length = 1;
                int current = num;
                while (set.contains(current + 1)) {
                    length++;
                    current++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
