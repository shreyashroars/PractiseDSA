class Solution {
    public int subarraySum(int[] arr, int k) {
      int prefSum=0,total=0;
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            prefSum+=arr[i];
            if(prefSum==k)
                total++;
            if(map.containsKey(prefSum-k))
                total=total+map.get(prefSum-k);
            map.put(prefSum,map.getOrDefault(prefSum,0)+1);
                
        }
        return total;
    }
}