class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=1;
        if(s.length()==0)
            return 0;
      char arr[]=s.toCharArray();
      HashMap<Character,Integer>m=new HashMap<>();
      int n=s.length();
      while(j<n)
      {
       m.put(arr[j],m.getOrDefault(arr[j],0)+1);
        if(m.size()==j-i+1)
       {
           max=Math.max(max,j-i+1);
           j++;
       }
       else
       {
           while(m.size()<j-i+1)
           {
              m.put(arr[i],m.getOrDefault(arr[i],0)-1);  
              if(m.get(arr[i])==0)
              m.remove(arr[i]);
              i++;
           }
           j++;
       }
      
      }
       return max; 
    }
}