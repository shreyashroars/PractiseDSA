class Solution {
    int floor,ceil;
    public void binSearch(int arr[],int key)
    {
        int low=0;
         floor=-10000;
         ceil= -10000;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<=key)
            {
                floor=arr[mid];
                low=mid+1;
            }
            else if(arr[mid]>key)
            {
                ceil=arr[mid];
                high=mid-1;
            }
                
        }
        
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n=arr1.length;
        int cnt=0;
        Arrays.sort(arr2);
        for(int i=0;i<n;i++)
        {
            binSearch(arr2,arr1[i]);
            if(floor!=-10000 && ceil!=-10000)
            {
                if(arr1[i]-floor>d && ceil-arr1[i]>d)
                    cnt++;
            }
            else if(floor!=-10000)
            {
                if(arr1[i]-floor>d)
                    cnt++;
            }
            else if(ceil!=-10000)
            {
                if(ceil-arr1[i]>d)
                    cnt++;
            }
                
        }
        return cnt;
        
    }
}