class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0];
        int n=arr.length;
        int maxProfit=0;
        for(int i=1;i<n;i++)
        {
            int cost=arr[i]-min;
            maxProfit=Math.max(maxProfit,cost);
            min=Math.min(min,arr[i]);
        }
        return maxProfit;
        
    }
}