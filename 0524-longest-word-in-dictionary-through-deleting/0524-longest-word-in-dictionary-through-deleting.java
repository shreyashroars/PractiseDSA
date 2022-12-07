class Solution {
    public String findLongestWord(String s, List<String> dic) {
        int n=dic.size();
        String t="";
        int max=0,temp=0;
       Collections.sort(dic);
     for(int i=0;i<n;i++)
     {
         int j=0,k=0;
         if(s.length()<dic.get(i).length())
             continue;
         while(j<dic.get(i).length() && k<s.length())
         {
             if(dic.get(i).charAt(j)==s.charAt(k))
             {
                 j++;
                 k++;
             }
             else
                 k++;
         }
         if(k<=s.length() && j==dic.get(i).length())
         {
             temp=max;
             max=Math.max(max,dic.get(i).length());
             if(temp!=max)
             t=dic.get(i);
         }
         
     }
        return t;
    }
}