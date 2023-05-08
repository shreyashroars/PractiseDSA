class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int low=0,high=n-1;
            int ans=-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(nums[mid]<nums[i])
                {
                    ans=mid;
                    low=mid+1;
                }
               
                else if(nums[mid]>=nums[i])
                    high=mid-1;
                
            }
            low=0;high=n-1;
            int ans2=-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(nums[mid]>nums[i])
                {
                    ans2=mid;
                    high=mid-1;
                }
                else if(nums[mid]<=nums[i])
                    low=mid+1;
                
            }
            if(ans!=-1 && ans2!=-1)
                sum+=1;
        
            
        }
        return sum;
        
    }
}