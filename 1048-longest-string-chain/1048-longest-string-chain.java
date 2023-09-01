class Solution {
    static boolean check(String a,String b)
    {
        if(a.length()!=b.length()+1)
        return false;
        int first=0;
        int second=0;
        while(first<a.length())
        {
            if(second<b.length() && a.charAt(first)==b.charAt(second))
            {
                first++;
                second++;
            }
            else
            first++;
        }
        return first==a.length() && second==b.length();
    }
    public int longestStrChain(String[] arr) {
        int n=arr.length;
        Comparator<String>comp=new Comparator<String>()
        {
            public int compare(String a,String b)
            {
                if(a.length()>b.length())
                return 1;
                else if(a.length()<b.length())
                return -1;
                else
                return 0;
            }

        };
        Arrays.sort(arr,comp);
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(check(arr[i],arr[j]) && dp[j]+1>dp[i])
                dp[i]=dp[j]+1;
            }
            max=Math.max(max,dp[i]);

        }
        return max;
        
    }
}