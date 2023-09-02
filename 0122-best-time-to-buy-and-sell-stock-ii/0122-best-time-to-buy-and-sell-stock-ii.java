class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int dp[][]=new int[n+1][2];
        dp[n][0]=dp[n][1]=0; //base case;
        for(int ind=n-1;ind>=0;ind--)
        {
            for(int buy=0;buy<=1;buy++)
            {
                if(buy==1)
                {
                 int not_take=0+dp[ind+1][1];
                 int take=-arr[ind]+dp[ind+1][0];
                 dp[ind][buy]=Math.max(take,not_take);  
                }
                else
                {
                 int not_take=0+dp[ind+1][0];
                 int take=arr[ind]+dp[ind+1][1];
                 dp[ind][buy]=Math.max(take,not_take);  
                }
            }
        }
        
        return dp[0][1];
        
    }
}