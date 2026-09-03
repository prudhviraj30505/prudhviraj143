class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int index=0;
        for(int i=0;i<n;i++){
            ans[index++]=nums[i];
            ans[index++]=nums[i+n];
        }
        return ans;
    }
}

OUTPUT:

Input
nums =
[1,2,3,4,4,3,2,1]
n =
4
Output
[1,4,2,3,3,2,4,1]
