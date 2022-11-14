class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
      int i=0,j=0,n=nums.length,c=0;
        double s=0.0,maxi=-100000.2;
        while(j<n)
        {
         s+=nums[j];
            if(j-i+1<k)
                j++;
            else if(j-i+1==k)
            {
                s=s/k;
               if(s>=threshold)
                   c++;
                s=(s*k-nums[i]);
                i++;
                j++;
            }
        }
       return c;
    }
}