class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
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
