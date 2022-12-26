class Solution {
    int n;
    public int minimumTotal(List<List<Integer>> t) {
        
        n=t.get(t.size()-1).size();
       // int dp[][]=new int[n][n];
        int prev[]=new int[n];
        for(int j=0;j<=n-1;j++)
            prev[j]=t.get(n-1).get(j);
        for(int i=n-2;i>=0;i--)
        {
            int curr[]=new int[i+1];
            int d=Integer.MAX_VALUE,dg=Integer.MAX_VALUE;
            for(int j=i;j>=0;j--)
            {
          d=t.get(i).get(j)+prev[j];
         dg=t.get(i).get(j)+prev[j+1];
         curr[j]=d>dg?dg:d;
                
            }
          prev=curr;
        }
        return prev[0];
    }
}