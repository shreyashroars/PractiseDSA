class Solution {
    public int no_ofw(String s)
    {
        int count=1;
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)==' ')
               count++;
        }
        return count;
    }
    public int mostWordsFound(String[] sen) {
        int maxi=0;
    for(int i=0;i<sen.length;i++)
    {
        maxi=Math.max(maxi,no_ofw(sen[i]));
    }
        return maxi;
    }
}