class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int x:nums)
        {
            m.put(x,m.getOrDefault(x,0)+1);
        }
        List<List<Integer>>arr=new ArrayList<>();
        int max=-1;
        int temp=-1;
        for(Map.Entry<Integer,Integer>e:m.entrySet())
        {
            if(max<e.getValue())
            {
                max=e.getValue();
                temp=e.getKey();
                
            }
                
        }
        
        for(int i=0;i<max;i++)
            arr.add(new ArrayList<>());
        int i=0;
            for(Map.Entry<Integer,Integer>e:m.entrySet())
            {
                int itr=e.getValue();
                    while(itr>0)
                {
                    arr.get(i).add(e.getKey());
                        i=(i+1)%max;
                        itr--;
                }
                
            }
        return arr;
            
    }
}