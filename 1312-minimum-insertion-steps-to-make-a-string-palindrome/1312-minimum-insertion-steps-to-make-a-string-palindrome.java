class Solution {
    String s1,s2;
    public int longpalsubseq(int i1,int i2,int [][]dp)
    {
        if(i1<0||i2<0)
            return 0;
        if(dp[i1][i2]!=-1)
            return dp[i1][i2];
        if(s1.charAt(i1)==s2.charAt(i2))
            return dp[i1][i2]=1+longpalsubseq(i1-1,i2-1,dp);
        else
            return dp[i1][i2]=0+Math.max(longpalsubseq(i1,i2-1,dp),longpalsubseq(i1-1,i2,dp));
}
    public int minInsertions(String s) {
        s1=s;
        int n=s.length();
        for(int i=0;i<s.length();i++)
            s2=s.charAt(i)+s2;
        int dp[][]=new int[n][n];
        for(int rows[]:dp)
        Arrays.fill(rows,-1);
        
      return s.length()-longpalsubseq(n-1,n-1,dp);
    }
}