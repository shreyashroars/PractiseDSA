class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
       int j=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
                arr[j++]=arr[i];
        }
        return j;
        
    }
}