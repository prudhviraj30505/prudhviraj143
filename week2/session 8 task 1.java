class Solution {
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        } 
        return maxSoFar;
    }
}

OUTPUT:

Input
nums =
[-2,1,-3,4,-1,2,1,-5,4]
Output
6
Expected
6
