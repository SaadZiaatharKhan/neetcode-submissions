class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s == "") return true;
        String modified = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = modified.length() - 1;
        while (left < right) {
            if (modified.charAt(left) != modified.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
