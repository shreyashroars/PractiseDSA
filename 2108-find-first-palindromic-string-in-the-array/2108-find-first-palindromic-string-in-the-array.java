class Solution {
    boolean pal(String s)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            t=s.charAt(i)+t;
        }
        return t.equals(s);
    }
    public String firstPalindrome(String[] words) {
      for(int i=0;i<words.length;i++)
      {
          if(pal(words[i]))
             return words[i];
      }
        return "";
    }
}