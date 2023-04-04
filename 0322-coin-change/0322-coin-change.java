class Solution {
    int coin[];
    public int minCoins(int ind,int amount,int[][]dp)
    {
        if(ind==0)
        {
            if(amount%coin[ind]==0)
                return amount/coin[ind];
            else
                return (int)1e9;
        }
        if(dp[ind][amount]!=-1)
            return dp[ind][amount];
        int notTake=0+minCoins(ind-1,amount,dp);
        int take=(int)1e9;
        if(coin[ind]<=amount)
            take=1+minCoins(ind,amount-coin[ind],dp);
        return dp[ind][amount]=Math.min(take,notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
                dp[i][j]=-1;
        }
        coin=new int[coins.length];
       for(int i=0;i<coins.length;i++)
           coin[i]=coins[i];
        int y= minCoins(coins.length-1,amount,dp);
        if(y>=(int)1e9)
            return -1;
        else
            return y;
    }
}