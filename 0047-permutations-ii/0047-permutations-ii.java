class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    List<List<Integer>>ans1=new ArrayList<>();
    
    List<Integer>a=new ArrayList<>();
    public void perm_rec(List<Integer>ds,int[]nums)
    {
        if(ds.size()==nums.length)
        {
            for(int i=0;i<ds.size();i++)
            {
                a.add(nums[ds.get(i)]);
            }
            ans.add(new ArrayList<>(a));
            a.clear();
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(ds.contains(i)) 
                    continue;
                ds.add(i);
                perm_rec(ds,nums);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        perm_rec(new ArrayList<>(),nums);
        HashSet<List<Integer>>h=new HashSet<>();
        for(List<Integer> x:ans)
            h.add(x);
        ans=new ArrayList<List<Integer>>(h);
        return ans;
    }
}