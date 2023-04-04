class Solution {
public:
    int minCoins(int ind,int amount,vector<vector<int>>&dp,vector<int>&coins)
    {
        if(ind==0)
        {
            if(amount%coins[ind]==0)
                return amount/coins[ind];
            else
                return 1e9;
        }
        if(dp[ind][amount]!=-1)
            return dp[ind][amount];
        int notTake=0+minCoins(ind-1,amount,dp,coins);
        int take=1e9;
        if(coins[ind]<=amount)
            take=1+minCoins(ind,amount-coins[ind],dp,coins);
        return dp[ind][amount]=min(take,notTake);
    }
    int coinChange(vector<int>& coins, int amount) {
        vector<vector<int>>dp(coins.size(), vector<int>(amount+1, -1));
        int res=minCoins(coins.size()-1,amount,dp,coins);
        if(res>=1e9)
            return -1;
        return res;
        
        
        
    }
};
