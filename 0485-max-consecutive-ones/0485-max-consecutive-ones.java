class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,n=nums.length;
        int cnt=0;
        int max=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]!=0)
                cnt++;
            else
            {
                
                max=Math.max(max,cnt);
                cnt=0;
            }
        }
        return cnt>max?cnt:max;
        
        
    }
}