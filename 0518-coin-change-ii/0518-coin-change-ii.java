class Solution {
    public int totComb(int ind,int amount,int coins[],int dp[][])
    {
        if(ind==0)
        {
            if(amount%coins[ind]==0)
                return 1;
            return 0;
        }
        if(dp[ind][amount]!=-1)
            return dp[ind][amount];
        int notTake=0+totComb(ind-1,amount,coins,dp);
        int take=0;
        if(coins[ind]<=amount)
            take=totComb(ind,amount-coins[ind],coins,dp);
        return dp[ind][amount]=take+notTake;
    }
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
        return totComb(coins.length-1,amount,coins,dp);
    }
}