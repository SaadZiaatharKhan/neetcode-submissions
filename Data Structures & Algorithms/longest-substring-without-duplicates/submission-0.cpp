class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int l = 0, r = 0, n = s.size(), maxLen = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        int hashLen = 256;
        int hash[hashLen];
        for (int i = 0; i < hashLen; ++i){
            hash[i] = -1;
        }
        while (r < n) {
            if (hash[s[r]] != -1) {
                l = max(hash[s[r]]+1, l);
            }
            int len = r - l + 1;
            maxLen = max(maxLen, len);
            hash[s[r]] = r;
            r++;
        }

        return maxLen;
    }
};
