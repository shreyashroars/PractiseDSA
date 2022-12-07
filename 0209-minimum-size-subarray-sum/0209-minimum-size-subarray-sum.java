class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int i=0,j=0,s=0,min=Integer.MAX_VALUE;
     while(j<nums.length)
     {
         s+=nums[j];
         if(s<target)
             j++;
         else
         {
             while(s>=target)
             {
                 min=Math.min(min,j-i+1);
                 s-=nums[i];
                 i++;
             }
             j++;
         }
        
     }
        return min==Integer.MAX_VALUE?0:min;
    }
}