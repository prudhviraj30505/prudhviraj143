class Solution {
    public int pivotIndex(int[] nums) {     
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {     
            total = total - nums[i];         
            if (leftSum == total) {
                return i;
            }      
            leftSum += nums[i];
        }  
        return -1;
    }
}

OUTPUT:

Case 1

Input
nums =
[1,7,3,6,5,6]
Output
3
Expected
3
