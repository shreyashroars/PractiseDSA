class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for(int i=0;i<nums.length-1;i++)
            {
            int j=i+1; 
            while(j<nums.length && j<=i+indexDiff) 
                {
                if((int)Math.abs(nums[i]-nums[j])<=valueDiff)
                    {
                    return true;}
                j++; }
            }
        return false;
        
    }
}