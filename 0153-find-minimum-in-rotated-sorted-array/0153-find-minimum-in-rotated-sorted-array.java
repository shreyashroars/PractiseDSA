class Solution {
    public int findMin(int[] arr) {
      int n=arr.length;
        int low=0;
        int high=n-1;
        int res=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid])
            {
                res=Math.min(res,arr[low]);
                low=mid+1;
            }
            else
            {
                res=Math.min(res,arr[mid]);
                high=mid-1;
            }
        }
        return res;
        
        
     
    }
}