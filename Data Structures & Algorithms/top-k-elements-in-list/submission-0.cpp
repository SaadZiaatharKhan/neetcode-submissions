class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> mpp;
        vector<int> result;
        for (int i = 0; i < nums.size(); i++){
            mpp[nums[i]]++;
        }
        for (int i = 0; i < k; i++){
            int maxval = 0, maxkey = 0;
            for (auto &it : mpp){
                if (it.second > maxval) maxkey = it.first;
                maxval = max(it.second, maxval);
            }
            mpp.erase(maxkey);
            result.push_back(maxkey);
        }
        return result;
    }
};
