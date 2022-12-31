class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length,sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=mat[i][i];
            mat[i][i]=0;
            sum+=mat[i][n-1-i];
        }
        return sum;
        
    }
}