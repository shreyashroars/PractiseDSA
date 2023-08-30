class Solution {
    public boolean searchMatrix(int[][] matrix, int x) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=n-1;
        while(i>=0&& j>=0 &&i<m&& j<n)
        {
            if(x==matrix[i][j])
                return true;
            else if(x>matrix[i][j])
                i++;
            else
                j--;
        }
        return false;
        
        
        
    }
}