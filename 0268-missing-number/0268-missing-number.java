class Solution {
    public int missingNumber(int[] nums) {
        int res;
        int n = nums.length;
        int temp =0;
        for(int a:nums){
            temp^=a;
        }
        for(int i=0;i<=nums.length;i++)
            temp^=i;
        return temp;
    }
}