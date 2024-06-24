class Solution {
public:
    int minKBitFlips(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> arr(n+1, 0); //initially zero
        int result = 0;
        int flipcount = 0;

        for(int i = 0; i < n; i++){
            flipcount += arr[i];
