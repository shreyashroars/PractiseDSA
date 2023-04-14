class Solution {
    String s,t;
    public int editDist(int i1,int i2,int [][]dp)
    {
        if(i1<0)
            return i2+1;
        if(i2<0)
            return i1+1;
        if(dp[i1][i2]!=-1)
            return dp[i1][i2];
        if(s.charAt(i1)==t.charAt(i2))
            return dp[i1][i2]=0+editDist(i1-1,i2-1,dp);
        else
        {
            int insOp=1+editDist(i1,i2-1,dp);
            int delOp=1+editDist(i1-1,i2,dp);
            int repOp=1+editDist(i1-1,i2-1,dp);
            int min=insOp;
            min=Math.min(min,delOp);
            min=Math.min(min,repOp);
            return dp[i1][i2]=min;
        }
       
    }
    public int minDistance(String s1, String s2) {
        s=s1;
        t=s2;
        int n1=s1.length();
        int n2=s2.length();
        int dp[][]=new int[n1][n2];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
       return  editDist(n1-1,n2-1,dp);
        
    }
}