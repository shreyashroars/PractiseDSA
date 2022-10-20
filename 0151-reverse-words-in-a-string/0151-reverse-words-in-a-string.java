class Solution {
    public String reverseWords(String s) {
        String t="";
        s=s.trim();
          int j=s.length();
        for(int i=s.length()-1;i>=0;i--)
        {
             if(i==0)
            {
                t=t+s.substring(i,j);
            }
             else if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
            t=t+s.substring(i+1,j)+" ";
            j=i;
            }
            else if(i!=s.length()-1 && s.charAt(i)==' '&& s.charAt(i+1)==' ')
                j=i;
           
        }
        return t; 
    }
}