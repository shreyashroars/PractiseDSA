class Solution {
public:
    int minimumDifference(vector<int>& nums, int k) {
      sort(nums.begin(),nums.end());
        int mini=1000000,n=nums.size();
       int i=0,j=0;
        while(j<n)
        {
            if(j-i+1<k)
                j++;
            else if(j-i+1==k)
            {
                if(mini>nums[j]-nums[i])
                    mini=nums[j]-nums[i];
                i++;
                j++;
            }
        }
        return mini;
    }
};