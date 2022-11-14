class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int i=0,j=0,n=nums.length;
        double s=0.0,maxi=-100000.2;
        while(j<n)
        {
         s+=nums[j];
            if(j-i+1<k)
                j++;
            else if(j-i+1==k)
            {
                s=s/k;
                maxi=Math.max(maxi,s);
                s=(s*k-nums[i]);
                i++;
                j++;
            }
        }
        return maxi;  
    }
}