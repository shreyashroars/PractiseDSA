class Solution {
//     public int rec(int ind,int prevInd,int arr[],int dp[][])
// 	{
// 		if(ind==n)
// 		return 0;
// 		if(dp[ind][prevInd+1]!=-1)
// 		return dp[ind][prevInd+1];
// 		int not_take=rec(ind+1,prevInd,arr,dp);
// 		int take=-(int)1e9;
// 		if(prevInd==0 ||arr[ind]>arr[prevInd])
// 		take=1+rec(ind+1,ind,arr,dp);
// 		return dp[ind][prevInd+1]=Math.max(take,not_take);

// 	}
    public int lengthOfLIS(int[] arr) {
        	int n=arr.length;
		   int dp[][]=new int[n+1][n+1];
        for(int ind=n-1;ind>=0;ind--)
        {
            for(int prevInd=ind-1;prevInd>=-1;prevInd--)
            {
                int not_take=dp[ind+1][prevInd+1];
		        int take=-(int)1e9;
		        if(prevInd==-1 ||arr[ind]>arr[prevInd])
                    take=1+dp[ind+1][ind+1];
		        dp[ind][prevInd+1]=Math.max(take,not_take);
                
            }
        }
        return dp[0][-1+1];
        
        
    }
}