class Solution {
    public String[] findRelativeRanks(int[] score) {
      HashMap<Integer,Integer>m=new HashMap<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        for(int x:score)
        {
            pq.add(x);
            m.put(x,i++);
        }
        String arr[]=new String[score.length];
        int p=1;
        while(!pq.isEmpty())
        {
            int u=m.get(pq.poll());
            if(p==1)
                arr[u]="Gold Medal";
            else if(p==2)
                arr[u]="Silver Medal";
            else if(p==3)
                arr[u]="Bronze Medal";
            else
                arr[u]=String.valueOf(p);
            p++;
        }
        return arr;
        
    }
}