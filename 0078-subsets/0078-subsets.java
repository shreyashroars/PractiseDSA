class Solution {
    List<List<Integer>>arr=new ArrayList<>();
    public void psubseq(int i,int[]nums,List<Integer>ar)
    {
        if(i>=nums.length)
        {
            arr.add(new ArrayList(ar));
            return;
        }
        ar.add(nums[i]);
        psubseq(i+1,nums,ar);
        ar.remove(ar.size()-1);
        psubseq(i+1,nums,ar);
    }
    public List<List<Integer>> subsets(int[] nums) {
    psubseq(0,nums, new ArrayList<>())   ;
    return arr;   
}
}