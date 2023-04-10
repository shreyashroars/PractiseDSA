class Solution {
    String s1="",s2="";
    public int lcs(int i1,int i2,int dp[][])
    {
        if(i1<0||i2<0)
            return 0;
        if(dp[i1][i2]!=-1)
            return dp[i1][i2];
        if(s1.charAt(i1)==s2.charAt(i2))
            return 1+lcs(i1-1,i2-1,dp);
        return dp[i1][i2]=0+Math.max(lcs(i1-1,i2,dp),lcs(i1,i2-1,dp));
    }
    public int longestPalindromeSubseq(String s) {
         s1=s;
        int dp[][]=new int[s.length()][s.length()];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
       for(int i=0;i<s.length();i++)
           s2=s.charAt(i)+s2;
        return lcs(s.length()-1,s.length()-1,dp);
        
    }
}