
class Solution {
public:
    vector<int> targetIndices(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        int low=0,high=n-1;
        int ans1=-1,ans2=-1;
        vector<int>arr;
        while(low<=high)
        {
            int mid=(high-low)/2+low;
            if(nums[mid]>target)
                high=mid-1;
            else if(nums[mid]<target)
                low=mid+1;
            else 
            {
                ans1=mid;
                    high=mid-1;
            }
                
        }
        low=0,high=n-1;
         while(low<=high)
        {
            int mid=(high-low)/2+low;
            if(nums[mid]>target)
                high=mid-1;
            else if(nums[mid]<target)
                low=mid+1;
            else 
            {
                ans2=mid;  
                    low=mid+1;
            }
                
        }
        if(ans1==-1)
            return arr;
        for(int i=ans1;i<=ans2;i++)
            arr.push_back(i);
        return arr;
        
    }
};