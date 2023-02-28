class Solution {
     List<List<Integer>>ans=new ArrayList<>();
    public void swap(int a,int b,int[]nums)
    {
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
    public void perm_rec(int ind,int[]nums)
    {
        if(ind==nums.length)
        {
            List<Integer>ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
                ds.add(nums[i]);
            ans.add(new ArrayList<>(ds));
            return;      
        }
        for(int i=ind;i<nums.length;i++)
        {
            swap(ind,i,nums);
            perm_rec(ind+1,nums);
            swap(ind,i,nums);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
     perm_rec(0,nums);
        return ans;
    }
}