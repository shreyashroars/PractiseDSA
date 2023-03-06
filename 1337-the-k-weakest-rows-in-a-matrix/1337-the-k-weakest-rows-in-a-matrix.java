class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int arr[]=new int[m];
      for(int i=0;i<m;i++)
          for(int j=0;j<n;j++)
          {
             if(mat[i][j]==1)
                 arr[i]++;
          }
        int ar[]=new int[k];
        int l=0;
        int min=0;
        while(l<k)
        {
            for(int i=0;i<m;i++)
                if(arr[min]>arr[i])
                {
                    min=i;
                }
             arr[min]=1000;
            ar[l]=min;
                l++;
            min=0;
        }
        return ar;
        
    }
}