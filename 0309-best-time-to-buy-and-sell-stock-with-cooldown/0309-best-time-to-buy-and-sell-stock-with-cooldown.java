class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int dp[][][]=new int[n+1][2][2];
        dp[n][0][0]=0;
        dp[n][0][1]=0;
        dp[n][1][0]=0;
        dp[n][1][1]=0;
        for(int ind=n-1;ind>=0;ind--)
        {
            for(int buy=0;buy<=1;buy++)
            {
                for(int canBuy=0;canBuy<=1;canBuy++)
                {
                    if(buy==1)
        {
            int not_take=dp[ind+1][1][1];
            int take=0;
            if(canBuy==1)
            take=-arr[ind]+dp[ind+1][0][1];
            dp[ind][buy][canBuy]=Math.max(take,not_take);
        }
        else
        {
            int not_take=dp[ind+1][0][1];
            int take=arr[ind]+dp[ind+1][1][0];
            dp[ind][buy][canBuy]=Math.max(take,not_take);
        }
                    
                    
                }
            }
        }
        
       return dp[0][1][1];
        
    }
}