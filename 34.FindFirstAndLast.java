class Solution {
    public int[] searchRange(int[] nums, int target) {
        int tar[] = {-1,-1};
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                if(count == 0)
                {
                    tar[0] = i;
                    tar[1] = i;
                    count++;
                }
                else
                {
                    tar[1] = i;
                }
            }
        }
        return tar;
    }
}