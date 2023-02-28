class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void perm_rec(List<Integer> ds,int nums[])
    {
        if(ds.size()==nums.length)
            ans.add(new ArrayList<>(ds));
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(ds.contains(nums[i]))
                    continue;
                ds.add(nums[i]);
                perm_rec(ds,nums);
                ds.remove(ds.size()-1);
            }
        }
            
    }
    public List<List<Integer>> permute(int[] nums) {
      perm_rec(new ArrayList<>(),nums);
        return ans;
    }
}