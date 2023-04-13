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
    public int minDistance(String word1, String word2) {
          s1=word1;
        s2=word2;
        int n1=word1.length();
        int n2=word2.length();
        int dp[][]=new int[n1][n2];
        for(int rows[]:dp)
        Arrays.fill(rows,-1);   
      int commonlen=longpalsubseq(n1-1,n2-1,dp);
        return n1-commonlen+n2-commonlen;
        
    }
}