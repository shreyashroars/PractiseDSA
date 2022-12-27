class Solution {
    int n;
    
    public int chpick(int r1,int c1,int r2,int c2,int [][]mat,int[][][][]dp)
    {
        if(r1>mat.length-1||r2>mat.length-1||c1>mat[0].length-1||c2>mat[0].length-1||mat[r1][c1]==-1||mat[r2][c2]==-1)
            return Integer.MIN_VALUE;
        if(r1==mat.length-1 && c1==mat[0].length-1)
            return mat[r1][c1];
        int cherries=0;
        if(dp[r1][c1][r2][c2]!=0)
            return dp[r1][c1][r2][c2];
        if(r1==r2 && c1==c2)
            cherries+=mat[r1][c1];
        else 
            cherries+=mat[r1][c1]+mat[r2][c2];
        int path1=chpick(r1,c1+1,r2,c2+1,mat,dp); //hh
         int path2=chpick(r1,c1+1,r2+1,c2,mat,dp); //hv
         int path3=chpick(r1+1,c1,r2+1,c2,mat,dp); //vv
         int path4=chpick(r1+1,c1,r2,c2+1,mat,dp); //vh
        cherries+= Math.max(Math.max(path1,path2),Math.max(path3,path4));
        dp[r1][c1][r2][c2]=cherries;
        return cherries;
        
        
    }
    public int cherryPickup(int[][] mat) {
         n=mat.length;
        int dp[][][][]=new int[n][n][n][n];
        return Math.max(0,chpick(0,0,0,0,mat,dp));
       
    }
}