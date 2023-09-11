class Solution {
    public int maxProduct(int[] arr) {
        int pref=1;
        int suff=1;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(pref==0)
            pref=1;
            if(suff==0)
            suff=1;
            pref*=arr[i];
            suff*=arr[n-1-i];
            max=Math.max(max,Math.max(pref,suff));
        } 
        return max;
    }
}