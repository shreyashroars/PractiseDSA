class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int res=0;
            int low=0,high=m-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(grid[i][mid]>=0)
                {
                    res=mid+1;
                    low=mid+1;
                }
                else
                    high=mid-1;
            }
            cnt+=m-res;
        }
        return cnt;
        
        
    }
}