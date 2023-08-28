class Solution {
    public int rec(int ind,int prevInd,int arr[],int dp[][])
	{
		if(ind==arr.length)
		return 0;
		if(dp[ind][prevInd+1]!=-(int)1e9)
		return dp[ind][prevInd+1];
		int not_take=rec(ind+1,prevInd,arr,dp);
		int take=-(int)1e9;
		if(prevInd==-1 ||arr[ind]>arr[prevInd])
		take=1+rec(ind+1,ind,arr,dp);
		return dp[ind][prevInd+1]=Math.max(take,not_take);

	}
    public int lengthOfLIS(int[] arr) {
        	int n=arr.length;
		   int dp[][]=new int[n][n+1];
		   for(int rows[]:dp)
		   Arrays.fill(rows,-(int)1e9);
		  return rec(0,-1,arr,dp);
        
    }
}