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
    public int findCeil(ArrayList<Integer>arr,int target)
    {
        int low=0;
        int high=arr.size()-1;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr.get(mid)>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else if(arr.get(mid)<target)
                low=mid+1;
        }
        return ans;
    }
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        ArrayList<Integer>temp=new ArrayList<>();
        temp.add(arr[0]);
        for(int i=1;i<n;i++)
        {
            if(arr[i]>temp.get(temp.size()-1))
                temp.add(arr[i]);
            else
            {
                int ind=findCeil(temp,arr[i]);
                temp.set(ind,arr[i]);
            }
        }
        return temp.size();
        
    }
}