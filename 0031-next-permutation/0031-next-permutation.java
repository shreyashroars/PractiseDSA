class Solution {
    public void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void rev(int[]arr,int a,int b)
    {
        while(a<b)
            swap(arr,a++,b--);
    }
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        if(n==1)
            return;
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])
            i--;
        if(i>=0)
        {
        int j=n-1;
        while(arr[j]<=arr[i])
            j--;
        swap(arr,i,j);
        }
        rev(arr,i+1,n-1);
        
    }
}