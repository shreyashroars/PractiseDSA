class Solution {
    public int maximumCount(int[] arr) {
        int n=arr.length;
        int low=0,high=n-1;
        int ans1=-1,ans2=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<=-1)
            {
                ans1=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        ans1=ans1+1;
        low=0;high=n-1;
         while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>0 && arr[mid]>=1)
            {
                ans2=mid;
               high=mid-1;
            }
            else
                low=mid+1;
        }
        
        ans2=n-ans2;
        if(ans1==0 && ans2==n && arr[0]==0)
            return 0;
        return Math.max(ans1,ans2);
        
        
    }
}