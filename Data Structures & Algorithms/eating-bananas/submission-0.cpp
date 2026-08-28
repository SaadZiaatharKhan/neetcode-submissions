class Solution {

private:
    int eatinghrs(vector<int>& arr, int hour){
        int totalhrs = 0;
        for (int i = 0; i < arr.size(); i++) {
            totalhrs += ceil(arr[i] + hour - 1) / hour;
        }
        return totalhrs;
    }

public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int low = 1, high = *max_element(piles.begin(), piles.end()), ans = INT_MAX;
        while (low <= high){
            int mid = (low + high) / 2;
            int totalhrs = eatinghrs(piles, mid);
            if (totalhrs <= h) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
};
