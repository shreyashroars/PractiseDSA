class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        //int dp[][][]=new int[n+1][2][2];
        int ahead[][]=new int[2][2];
        int curr[][]=new int[2][2];
        ahead[0][0]=0;
        ahead[0][1]=0;
        ahead[1][0]=0;
        ahead[1][1]=0;
        for(int ind=n-1;ind>=0;ind--)
        {
            for(int buy=0;buy<=1;buy++)
            {
                for(int canBuy=0;canBuy<=1;canBuy++)
                {
                    if(buy==1)
        {
            int not_take=ahead[1][1];
            int take=0;
            if(canBuy==1)
            take=-arr[ind]+ahead[0][1];
            curr[buy][canBuy]=Math.max(take,not_take);
        }
        else
        {
            int not_take=ahead[0][1];
            int take=arr[ind]+ahead[1][0];
            curr[buy][canBuy]=Math.max(take,not_take);
        }
                    
                    
                }
                
            }
            ahead=curr;
        }
        
       return ahead[1][1];
        
    }
}