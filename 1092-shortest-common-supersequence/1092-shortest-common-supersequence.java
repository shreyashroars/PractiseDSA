class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        int dp[][]=new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int i=n1,j=n2;
        String ans="";
        while(i>0 && j>0)
        {
            if(str1.charAt(i-1)==str2.charAt(j-1))
            {
                ans=str1.charAt(i-1)+ans;
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                ans=str1.charAt(i-1)+ans;
                i--;
            }
            else
            {
                ans=str2.charAt(j-1)+ans;
                j--;
            }
        }
        while(i>0)
        {
            ans=str1.charAt(i-1)+ans;
            i--;
        }
        while(j>0)
        {
            ans=str2.charAt(j-1)+ans;
            j--;
        }
        return ans;
    }
}