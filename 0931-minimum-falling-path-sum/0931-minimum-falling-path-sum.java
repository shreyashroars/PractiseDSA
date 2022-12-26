class Solution {
    int n;
    public int minFallingPathSum(int[][] matrix) {
        
         n=matrix.length;
        int prev[]=new int[n];
        for(int j=0;j<n;j++)
       prev[j]=matrix[0][j];
        for(int i=1;i<n;i++)
        {
            int curr[]=new int[n];
            int up=1000000,left=1000000,right=1000000;
            for(int j=0;j<n;j++)
            {
                up=matrix[i][j]+prev[j];
                if(j>0)
                left=matrix[i][j]+prev[j-1];
                if(j<n-1)
                right=matrix[i][j]+prev[j+1];
                curr[j]=Math.min(up,Math.min(left,right));  
            }
            prev=curr;
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)//This is the no. of column since ans can be from matrix[n-1][0] or //matrix[n-1][1]... and so on
        {
            mini=Math.min(mini,prev[i]);
        }
        return mini;
    }
}