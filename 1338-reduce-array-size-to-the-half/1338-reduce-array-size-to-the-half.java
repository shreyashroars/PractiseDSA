class Solution {
    public int minSetSize(int[] arr) {
      HashMap<Integer,Integer>h=new HashMap<>();
        for(int x:arr)
            h.put(x,h.getOrDefault(x,0)+1);
        PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
        for(Map.Entry<Integer,Integer>e:h.entrySet())
            q.add(e.getValue());
        int n=arr.length;
        int ans=0;
        while(n>arr.length/2)
        {
            ans+=1;
            n=n-q.poll();
        }
        return ans;
    }
}