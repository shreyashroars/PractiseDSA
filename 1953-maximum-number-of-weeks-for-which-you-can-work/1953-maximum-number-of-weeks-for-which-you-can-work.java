class Solution {
    public long numberOfWeeks(int[] arr) {
        long sum=0;
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
            sum+=arr[i];
        }
        long remSum=sum-max;
        if(remSum<=max-1)
            return 2*remSum+1;
        return sum;
        
        
        
        
    }
}