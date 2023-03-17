class Solution {
    public List<Integer> partitionLabels(String s) {
     HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<s.length();i++)
            h.put(s.charAt(i),i);
        int max=-1;
        int prev=-1;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            max=(int)Math.max(max,h.get(s.charAt(i)));
            if(max==i)
            {
                ans.add(max-prev);
                prev=max;
            }
            
        }
        return ans;
    }
}