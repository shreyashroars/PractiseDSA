class Solution {
    public int largestAltitude(int[] gain) {
    int n=gain.length; 
        int t=0,maxi=0;
        for(int i=0;i<n;i++)
            {
            maxi=Math.max(maxi,gain[i]+t);
            t=gain[i]+t;
            }
        return maxi;
    }
}