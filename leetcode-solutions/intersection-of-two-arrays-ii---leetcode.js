
    while (i < nums1.size() && j < nums2.size())
      if (nums1[i] < nums2[j]) {
        ++i;
      } else if (nums1[i] > nums2[j]) {
        ++j;
      } else {
        ans.push_back(nums1[i]);
        ++i;
    int j = 0;  // nums2's index
    int i = 0;  // nums1's index
    vector<int> ans;
    ranges::sort(nums2);

    ranges::sort(nums1);
 public:
  vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
class Solution {