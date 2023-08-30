class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
         int n=arr.length;
        Arrays.sort(arr);
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int max2=0;
        int hash[]=new int[n];
        int lastIndex=0;
        for(int i=0;i<n;i++)
        {
            hash[i]=i;
            int max1=dp[i];
            for(int prev=0;prev<i;prev++)
            {
                if(arr[i]%arr[prev]==0)
                {
                    max1=Math.max(max1,1+dp[prev]);
                    if(max1!=dp[i])
                    {
                        dp[i]=max1;
                        hash[i]=prev;
                    }
                }
            }
            if(dp[i]>max2)
            {
                max2=dp[i];
                lastIndex=i;
            }

        }
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(arr[lastIndex]);
        while(hash[lastIndex]!=lastIndex)
        {
            lastIndex=hash[lastIndex];
            ans.add(arr[lastIndex]);
        }
        return ans;
    }
        
    }