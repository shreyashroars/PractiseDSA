class Solution {
    int n;
    public int rec_min(int i,int j,List<List<Integer>> t,int[][]dp)
    {
        if(i==n-1)
            return t.get(i).get(j);
        if(dp[i][j]!=-1)
            return dp[i][j];
      int  d=t.get(i).get(j)+rec_min(i+1,j,t,dp);
       int  dg=t.get(i).get(j)+rec_min(i+1,j+1,t,dp);
        return dp[i][j]=d>dg?dg:d;
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        
        n=triangle.get(triangle.size()-1).size();
        int dp[][]=new int[n][n];
        for(int[]rows:dp)
            Arrays.fill(rows,-1);
       return  rec_min(0,0,triangle,dp);
    }
}