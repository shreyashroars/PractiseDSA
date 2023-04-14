class Solution {
    String s1,s2;
    public int distsub(int i1,int i2,int dp[][])
    {
        if(i2<0)
            return 1;
        if(i1<0)
            return 0;
        if(dp[i1][i2]!=-1)
            return dp[i1][i2];
        if(s1.charAt(i1)==s2.charAt(i2))
            return dp[i1][i2]=distsub(i1-1,i2-1,dp)+distsub(i1-1,i2,dp);
        else
            return dp[i1][i2]=distsub(i1-1,i2,dp);
    }
    public int numDistinct(String s, String t) {
        s1=s;
        s2=t;
        int n1=s.length();
        int n2=t.length();
        int dp[][]=new int[n1][n2];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
       return  distsub(n1-1,n2-1,dp);
        
    }
}