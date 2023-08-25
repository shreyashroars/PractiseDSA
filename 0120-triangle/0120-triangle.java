class Solution {
    public int rec(List<List<Integer>> tr,int i,int j,int m,int[][]dp)
    {
        if(i==m-1)
            return tr.get(i).get(j);
        if(dp[i][j]!=-1)
            return dp[i][j];
        return dp[i][j]=Math.min(rec(tr,i+1,j,m,dp),rec(tr,i+1,j+1,m,dp))+tr.get(i).get(j);
        
    }
    public int minimumTotal(List<List<Integer>> tr) {
        int m=tr.size();
        int n=tr.get(m-1).size();
        int dp[][]=new int[m][n];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
        return rec(tr,0,0,m,dp);
        
    }
}