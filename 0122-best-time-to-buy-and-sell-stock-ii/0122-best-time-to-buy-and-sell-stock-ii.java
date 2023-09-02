class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
       // int dp[][]=new int[n+1][2];
        int ahead[]=new int[2];
        int curr[]=new int[2];
        ahead[0]=ahead[1]=0; //base case
        //dp[n][0]=dp[n][1]=0; //base case;
        for(int ind=n-1;ind>=0;ind--)
        {
            for(int buy=0;buy<=1;buy++)
            {
                if(buy==1)
                {
                 int not_take=0+ahead[1];
                 int take=-arr[ind]+ahead[0];
                 curr[buy]=Math.max(take,not_take);  
                }
                else
                {
                 int not_take=0+ahead[0];
                 int take=arr[ind]+ahead[1];
                 curr[buy]=Math.max(take,not_take);  
                }
            }
            ahead=curr;
        }
        
        return ahead[1];
        
    }
}