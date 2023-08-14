class Solution {
    public int minEatingSpeed(int[] arr, int h){
        int low=1;
        int n=arr.length;
        int high=arr[0];
        int res=1;
        for(int i=1;i<n;i++)
        {
            if(high<arr[i])
                high=arr[i];
                
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long sum=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%mid==0)
                    sum+=arr[i]/mid;
                else
                    sum+=(arr[i]/mid)+1;
            }
            if(sum<=h)
            {
                 res=mid;
                high=mid-1;
            }
            else if(sum>h)
                low=mid+1;
        }
        return res;
        
        
    }
}