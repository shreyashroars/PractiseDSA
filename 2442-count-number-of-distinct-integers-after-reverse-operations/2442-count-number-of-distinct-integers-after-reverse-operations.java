class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int x:nums)
            h.add(x);
       
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i],r,rev=0;
            while(n>0)
            {
                r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
           h.add(rev);
                
        }
        return h.size();
        
    }
}