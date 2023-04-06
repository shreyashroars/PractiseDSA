class Solution {
    String s1,s2;
    public int longseq(int ind1,int ind2,int [][]dp)
    {
        if(ind1<0 ||ind2<0) return 0;
        if(dp[ind1][ind2]!=-1)
            return dp[ind1][ind2];
        if(s1.charAt(ind1)==s2.charAt(ind2)) //if it matches
            return dp[ind1][ind2]=1+longseq(ind1-1,ind2-1,dp); //if it doesn't match
        return dp[ind1][ind2]=Math.max(longseq(ind1-1,ind2,dp),longseq(ind1,ind2-1,dp));
        
    }
    public int longestCommonSubsequence(String text1, String text2) {
        s1=text1;
        s2=text2;
        int dp[][]=new int[text1.length()][text2.length()];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
        return longseq(text1.length()-1,text2.length()-1,dp);
        
    }
}