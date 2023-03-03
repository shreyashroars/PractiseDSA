class Solution {
    public void moveZeroes(int[] nums) {
        int no_of0=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                no_of0++;
            else if(no_of0>0)
            {
                int temp=nums[i];
                nums[i]=0;
                nums[i-no_of0]=temp;
            }
        }
    }
}