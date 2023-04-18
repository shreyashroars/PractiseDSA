class Solution {
   int profit=-2;
    public int stocks(int ind,int buy,int[]prices,int [][]dp)
    {
        if(ind==prices.length) // he bought but could not sell so we must return 0
            return 0;
        if(dp[ind][buy]!=-1)
            return dp[ind][buy];
       if(buy==1)
       {
           profit=Math.max(-prices[ind]+stocks(ind+1,0,prices,dp)//bought the stock on that day
                           ,0+stocks(ind+1,1,prices,dp)//not bought the stock on that day
                          );
    }
    else
    {
        profit=Math.max(prices[ind]+stocks(ind+1,1,prices,dp)//bought the stock on that day
                           ,0+stocks(ind+1,0,prices,dp)//not bought the stock on that day
                          );
        
    }
    return dp[ind][buy]=profit;
}
    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length][2];
        for(int[] rows:dp)
            Arrays.fill(rows,-1);
        
       return stocks(0,1,prices,dp);
    }
}