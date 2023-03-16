class Solution {
    public String frequencySort(String s) {
      int arr[]=new int[123];
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
           arr[ch[i]]++;
        TreeMap<Character,Integer>h=new TreeMap<>();
        int i=48;
        while(i<123)
        {
            if(arr[i]!=0)
                h.put((char)i,arr[i]);
            i++;
        }
        PriorityQueue<Pair<Integer,Character>>pq=new PriorityQueue<>((a, b) -> a.getKey() - b.getKey());
        String j="";
        //Array.sort(Collections.reverseOrder());
        for(Map.Entry<Character,Integer>e:h.entrySet())
        {
          pq.add(new Pair<>(e.getValue(),e.getKey()));
        }
        //String s="";
        while(!pq.isEmpty())
        {
            int cnt=pq.peek().getKey();
            char y=pq.peek().getValue();
            while(cnt>0)
            {
                j=y+j;
                cnt--;
            }  
            pq.poll();
        }
        return j;
    }
}