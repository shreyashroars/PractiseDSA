
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int y=target-nums[i];
            if(map.containsKey(y))
            {
                ans[0]=map.get(y);
                ans[1]=i;
                return ans;
            }
            else
                map.put(nums[i],i);
            
        }
        return ans;
    }
}