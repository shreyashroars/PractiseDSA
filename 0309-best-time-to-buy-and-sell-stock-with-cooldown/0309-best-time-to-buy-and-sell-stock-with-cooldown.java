class Solution {
    public int rec(int ind,int buy,int canBuy,int arr[],int n,int dp[][][])
    {
        if(ind==n)
        return 0;
        if(dp[ind][buy][canBuy]!=-1)
        return dp[ind][buy][canBuy];
        if(buy==1)
        {
            int not_take=rec(ind+1,1,1,arr,n,dp);
            int take=0;
            if(canBuy==1)
            take=-arr[ind]+rec(ind+1,0,1,arr,n,dp);
            return dp[ind][buy][canBuy]=Math.max(take,not_take);
        }
        else
        {
            int not_take=rec(ind+1,0,1,arr,n,dp);
            int take=arr[ind]+rec(ind+1,1,0,arr,n,dp);
            return dp[ind][buy][canBuy]=Math.max(take,not_take);
        }
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][][]=new int[n][2][2];
        for(int arr[][]:dp)
        {
            for(int rows[]:arr)
            Arrays.fill(rows,-1);
        }
       return rec(0,1,1,prices,n,dp);
        
    }
}