class Solution {
    public int minimumOperations(int[] nums) {
       HashSet<Integer>h=new HashSet<>();
        for(int x:nums)
            if(x>0)
            h.add(x);
        return h.size();
    }
}