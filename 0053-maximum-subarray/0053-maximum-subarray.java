class Solution {
    public int maxSubArray(int[] arr) {
        int sum=0,max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
        }
        return max;
        
    }
}