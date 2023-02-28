class Solution {
    public void rev(int i,int matrix[][],int n)
    {
        int a=0;
        while(a<(n)/2)
        {
        int t=matrix[i][a];
        matrix[i][a]=matrix[i][n-1-a];
        matrix[i][n-1-a]=t;
        a++;
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
      for(int i=0;i<n;i++)
      {
          for(int j=i+1;j<n;j++)
          {
              int temp=matrix[i][j];
              matrix[i][j]=matrix[j][i];
              matrix[j][i]=temp;
          }
      }
        for(int i=0;i<matrix.length;i++)
        {
            rev(i,matrix,matrix.length);
        }
        
    }
}