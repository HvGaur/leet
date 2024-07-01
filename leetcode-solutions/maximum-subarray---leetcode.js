class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        // if(nums.size() == 1) return nums[0];
        int csum = nums[0];
        int msum = nums[0];
        for(int i = 1; i < nums.size(); i++){
            csum = max(csum, 0) + nums[i];
            msum = max(csum, msum);
        }
        return msum;
    }
};