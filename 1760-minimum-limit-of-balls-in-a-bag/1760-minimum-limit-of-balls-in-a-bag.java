class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int max=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++)
            if(max<nums[i])
                max=nums[i];
        //penalty can go from 1 to max of array element
        //we choose penalty and for each penalty find out no of operation
        int l=1;
        int r=max;
        
        int res=r;
        while(l<r)
        {
            int op=0;
            int mid=l-(l-r)/2;
            for(int i=0;i<n;i++)
            {
                if(nums[i]%mid==0)
                    op+=nums[i]/mid-1;
                else
                    op+=nums[i]/mid;
                    
            }
            if(op<=maxOperations)
            {
                res=mid;   // here we can have more cases as different no can give same no of oprations
                r=mid;
            }
            else
            {
                l=mid+1;
            }
            
        }
        return res;
        
    }
}