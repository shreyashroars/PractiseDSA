class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer>h=new HashMap<>();
        h.put(0,1);
        int cnt=0,presum=0;
        for(int i=0;i<nums.length;i++)
        {
             presum+=nums[i];
            int remove_frm_presum=presum-k;
            if(h.containsKey(remove_frm_presum))
            {
                cnt+=h.get(remove_frm_presum);
               // System.out.print(remove_frm_presum);
            }
            if(h.containsKey(presum))
                h.put(presum,h.get(presum)+1);
            else
                h.put(presum,1);
            
        }
        return cnt;
    }
}