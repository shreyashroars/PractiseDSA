class Solution {
    String s1,s2;
    public int wm(int i1,int i2,int dp[][])
    {
        if(i1<0&& i2<0)
            return 1;
        if(i1<0 && i2>=0)
            return 0;
        if(i1>=0 && i2<0)
        {
            for(int i=0;i<=i1;i++)
                if(s1.charAt(i)!='*')
                    return 0;
            return 1;
        }
        if(dp[i1][i2]!=-1)
            return dp[i1][i2];
            if(s1.charAt(i1)=='*')
            return dp[i1][i2]=wm(i1-1,i2,dp)|wm(i1,i2-1,dp);
        else if(s1.charAt(i1)==s2.charAt(i2) ||s1.charAt(i1)=='?')
            return dp[i1][i2]=wm(i1-1,i2-1,dp);
        else
            return dp[i1][i2]=0;
    }
    public boolean isMatch(String s, String p) {
        s1=p;
        s2=s;
        int n1=p.length();
        int n2=s.length();
        int dp[][]=new int[n1][n2];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
       return  wm(n1-1,n2-1,dp)==1?true:false;
        
    }
}