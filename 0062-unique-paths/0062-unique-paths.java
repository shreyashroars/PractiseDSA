class Solution {
    public int uniquePaths(int m, int n) {
       int prev[]=new int[n];
        for(int i=0;i<m;i++)
        {
            int curr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0)
                    curr[0]=1;
                else
                {
                int a=0;
                if(i>=1)
                    a=prev[j];
                int b=0;
                if(j>=1)
                    b=curr[j-1];
                curr[j]=a+b;
                }
               
            }
             prev=curr;
        }
        return prev[n-1];
    }
}