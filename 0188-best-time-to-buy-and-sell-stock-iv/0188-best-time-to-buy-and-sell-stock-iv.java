class Solution {
    public  int rec(int ind,int buy,int cap,int arr[],int n,int dp[][][])
    {
        if(cap==0||ind==n)
        return 0;
        if(dp[ind][buy][cap]!=-1)
        return dp[ind][buy][cap];
        if(buy==1)
        {
            int not_take=0+rec(ind+1,1,cap,arr,n,dp);
            int take=-arr[ind]+rec(ind+1,0,cap,arr,n,dp);
            return dp[ind][buy][cap]=Math.max(take,not_take);
        }
        else
        {
            int not_take=0+rec(ind+1,0,cap,arr,n,dp);
            int take=arr[ind]+rec(ind+1,1,cap-1,arr,n,dp);
            return dp[ind][buy][cap]=Math.max(take,not_take);

        }
    }
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int dp[][][]=new int[n][2][k+1];
        for(int arr[][]:dp)
        {
            for(int rows[]:arr)
            Arrays.fill(rows,-1);
        }
       return rec(0,1,k,prices,n,dp);
        
    }
}