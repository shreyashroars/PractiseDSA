class Solution {
    public int maximumXOR(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++)
            x=nums[i]|x;
        return x;
    }
}