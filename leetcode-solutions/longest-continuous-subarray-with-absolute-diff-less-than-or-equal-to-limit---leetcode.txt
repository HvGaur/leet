class Solution {
public:
    int longestSubarray(vector<int>& nums, int limit) {
        multiset<int> window_elements; 
        int longest_subarray_length = 0; // Variable to keep track of the max subarray length.
        int window_start = 0; // Starting index of the sliding window.

        // Iterate over the array using `i` as the end of the sliding window.
        for (int window_end = 0; window_end < nums.size(); ++window_end) {
            // Insert the current element into the multiset