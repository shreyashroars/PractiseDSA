class Solution {
    public int findNumberOfLIS(int[] arr) {
      int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int max=0;
        int cnt[]=new int[n];
        Arrays.fill(cnt,1);
        int lastInd=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[i] && dp[j]+1>dp[i])
                {
                    dp[i]=dp[j]+1;
                    cnt[i]=cnt[j];
                }
                else if(arr[j]<arr[i] && dp[j]+1==dp[i])
                    cnt[i]+=cnt[j];
            }
            max=Math.max(max,dp[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(dp[i]==max)
            sum+=cnt[i];
        }
        return sum;
    }
}