class Solution {
    public int rec(int ind,int buy,int arr[],int n,int dp[][][],int cap)
    {
        if(cap==0||ind==n)
            return 0;
        if(dp[ind][buy][cap]!=-1)
            return dp[ind][buy][cap];
        if(buy==1)
        {
            int not_take=0+rec(ind+1,1,arr,n,dp,cap);
            int take=-arr[ind]+rec(ind+1,0,arr,n,dp,cap);
           return dp[ind][buy][cap]=Math.max(take,not_take);
        }
        else
        {
            int not_take=0+rec(ind+1,0,arr,n,dp,cap);
            int take=arr[ind]+rec(ind+1,1,arr,n,dp,cap-1);
            return dp[ind][buy][cap]=Math.max(take,not_take);
            
        }
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][][]=new int[n][2][3];
        for(int arr[][]:dp)
            for(int rows[]:arr)
                Arrays.fill(rows,-1);
        return rec(0,1,prices,n,dp,2);
        
    }
}