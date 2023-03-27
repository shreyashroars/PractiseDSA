class Solution {
    public int findKthLargest(int[] nums, int k) {
        int freq[]=new int[20001];
       for(int x:nums)
           freq[10000+x]++;
        for(int i=freq.length-1;i>=0;i--)
        {  
            k=k-freq[i];
               if(k<=0)
                   return i-10000;
        }
        return Integer.MIN_VALUE;
            
    }
}