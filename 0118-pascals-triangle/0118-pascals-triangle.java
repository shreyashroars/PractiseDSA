class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            
            List<Integer>arr1=Arrays.asList(new Integer[i+1]);
            Collections.fill(arr1,1);
            for(int j=1;j<i;j++)
            {
                arr1.set(j,arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
            }
            arr.add(arr1);
            
        }
        return arr;
        
    }
}