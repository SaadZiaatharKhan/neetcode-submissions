#include <map>
using namespace std;

class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) return false;

        map<char, int> letters;
        
        for (int i = 0; i < s.length(); i++){
            letters[s[i]]++;
        }

        for (int i = 0; i < t.length(); i++){
            letters[t[i]]--;
            if (letters[t[i]] < 0) return false;
        }

        return true;
    }
};
