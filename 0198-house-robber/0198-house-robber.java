class Solution {
    
    public int rob(int[] nums) {
        int prev2=0,prev=nums[0],curr;
       for(int i=1;i<nums.length;i++)
       {
           if(i==1)
           {
               curr=Math.max(nums[0],nums[1]);
               prev2=nums[0];
               prev=curr;
               continue;
           }
       int pick=nums[i]+prev2;
       int ntpick=0+prev;
       curr=(int)Math.max(pick,ntpick);
           prev2=prev;
           prev=curr;
    }
        return prev;
}
}