class Solution {
    public void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int n=nums.length;
        int j=n-1;
        int arr[]=new int[n];
        int k=0;
        while(i<=j)
        {
            if(Math.abs(nums[i])>Math.abs(nums[j]))
            {
                arr[k++]=nums[i]*nums[i];
                i++;
            }
            else
            {
                arr[k++]=nums[j]*nums[j];
                j--;
                
            }
            
        }
        int mid=n/2;
        for(int l=0;l<mid;l++)
        {
            swap(arr,l,n-1-l);
        }
        return arr;
        
        
        
        
    }
}