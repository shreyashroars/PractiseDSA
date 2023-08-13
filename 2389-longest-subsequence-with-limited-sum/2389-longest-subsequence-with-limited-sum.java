class Solution {
    public int binSearch(int arr[],int key)
    {
        int low=0;
        int res=-1;
       int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<=key)
            {
                res=mid;
                low=mid+1;
            }
            else if(arr[mid]>key)
                high=mid-1;
        }
        return res+1;
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n=nums.length;
        int prefSum[]=new int[n];
        prefSum[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            prefSum[i]=prefSum[i-1]+nums[i];
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            //find floor of an element
            ans[i]=binSearch(prefSum,queries[i]);
        }
        return ans;
        
    }
}