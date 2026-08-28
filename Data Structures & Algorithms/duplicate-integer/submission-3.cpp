#include <unordered_set>
#include <vector>
using namespace std;

class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> seen;
        for (int num : nums) {
            if (seen.count(num)) { // Already in the set → duplicate found
                return true;
            }
            seen.insert(num);
        }
        return false; // No duplicates found
    }
};
