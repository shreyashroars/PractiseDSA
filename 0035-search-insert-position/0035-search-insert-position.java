class Solution {
    public int searchInsert(int[] arr, int target) {
        int low=0;
        int n=arr.length;
        int res=-1;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]<=target)
            {
                res=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        if(res==-1)
            return res+1;
        else if(arr[res]==target)
            return res;
        else
            return res+1;
        
    }
}