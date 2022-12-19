class Solution {
public:
  
    vector<int> twoSum(vector<int>& nums, int target) {
     unordered_map<int,int>x;
        vector<int>v;
        for(int i=0;i<nums.size();i++)
        { 
            if(x.find(target-nums[i]) != x.end())
            {
                v.push_back(x[target-nums[i]]);
                v.push_back(i);
                return v;
            }
            x[nums[i]] = i;
        }
        return v;
    }
};