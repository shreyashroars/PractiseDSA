class Solution {
    public int binSearch(int arr[],int key)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low-(low-high)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return -1;
    }
    public int[] fairCandySwap(int[] arr1, int[] arr2) {
        int pSum1=arr1[0];
        int pSum2=arr2[0];
        int n1=arr1.length;
        int n2=arr2.length;
        for(int i=1;i<n1;i++)
            pSum1+=arr1[i];
        for(int i=1;i<n2;i++)
            pSum2+=arr2[i];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<n1;i++)
        {
            int req=(pSum2-pSum1)/2+arr1[i];
            if(binSearch(arr2,req)!=-1)
                return new int[]{arr1[i],req};  
        }
        return new int[2];
        
    }
}