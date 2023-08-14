class Solution {
    public int findMin(int[] nums) {
       int high,n;
        n=nums.length;
        high=n-1;
        int low=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int next=(mid+1)%n;
            int prev=(mid-1+n)%n;
            if(nums[mid]<=nums[next]&& nums[mid]<=nums[prev])
                return nums[mid];
            else if(nums[mid]<=nums[high])
                high=mid-1;
            else if(nums[mid]>=nums[low])
                low=mid+1;
        }
        return 0;
        
        
     
    }
}