class Solution {
    int ind_of0=-1;
    public void swap(int a,int b,int[]nums)
    {
         if(b+1<nums.length && nums[b+1]==0)
        ind_of0=b+1;
        else
            ind_of0=a;
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
       
    }
    public void moveZeroes(int[] nums) {
       int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=0 && ind_of0!=-1)
                swap(i,ind_of0,nums);
            if(nums[i]==0  && ind_of0==-1)
                ind_of0=i;
            i++;
        }
    }
}