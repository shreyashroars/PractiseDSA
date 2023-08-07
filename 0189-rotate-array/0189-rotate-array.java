
class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
     int arr1[] =new int[n] ;
        int i1=0;
        for(int i=0;i<n;i++)
        {
            i1=(i+k)%n;
            arr1[i1]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=arr1[i];
        }
}
}