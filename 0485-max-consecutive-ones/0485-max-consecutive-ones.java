class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,n=nums.length;
        int res=Integer.MIN_VALUE;
        while(i<n)
        {
            int cnt=0;
            while(i<n&&nums[i]!=0)
            {
                cnt++;
                i++;
            }
            i++;
            res=Math.max(res,cnt);
        }
        return res;
        
    }
}