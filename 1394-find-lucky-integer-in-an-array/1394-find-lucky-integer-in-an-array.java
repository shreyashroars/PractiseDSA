class Solution {
    public int findLucky(int[] arr) {
        int ar[]=new int[501];
        for(int i=0;i<arr.length;i++)
        {
            ar[arr[i]]++;
        }
        for(int i=ar.length-1;i>=1;i--)
        {
            if(ar[i]==i)
                return i;
               
        }
        return -1;
    }
}