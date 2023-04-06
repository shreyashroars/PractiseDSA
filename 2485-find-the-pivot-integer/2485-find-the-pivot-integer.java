class Solution {
    public int pivotInteger(int n) {
        int arr[]=new int[n+1];
        int arr1[]=new int[n+1];
        arr[1]=1;
        arr1[n]=n;
        for(int i=2;i<=n;i++)
            arr[i]=arr[i-1]+i;
       // System.out.println(Arrays.toString(arr));
        for(int i=n-1;i>=1;i--)
            arr1[i]=arr1[i+1]+i;
        // System.out.println(Arrays.toString(arr1));
        for(int i=1;i<=n;i++)
            if(arr[i]-arr1[i]==0)
                return i;
        return -1;
            
        
        
    }
}