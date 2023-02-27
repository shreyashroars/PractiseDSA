class Solution {
    public void setZeroes(int[][] matrix) {
        int new_matrix[][]=new int[matrix.length][matrix[0].length];
          for(int i=0;i<matrix.length;i++)
      {
          for(int j=0;j<matrix[0].length;j++)
          {
              new_matrix[i][j]=matrix[i][j];
          }
          }
      for(int i=0;i<matrix.length;i++)
      {
          for(int j=0;j<matrix[0].length;j++)
          {
              if(matrix[i][j]==0)
              {
                 for(int k=0;k<matrix.length;k++)
                     new_matrix[k][j]=0;
                 for(int k=0;k<matrix[0].length;k++)
                     new_matrix[i][k]=0;
              }
                  
              }
          }
        for(int i=0;i<matrix.length;i++)
      {
          for(int j=0;j<matrix[0].length;j++)
          {
              matrix[i][j]=new_matrix[i][j];
          }
        }
       
      }
        
    
}