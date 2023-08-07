class Solution {
    public void moveZeroes(int[] arr) {
        int cnt_of_zero=0;
        for(int i=0;i<arr.length;i++) 
        {
            if(arr[i]==0)
                cnt_of_zero++;
            else {
                int temp=arr[i];
                arr[i]=arr[i-cnt_of_zero];
                arr[i-cnt_of_zero]=temp;
                
            }
        }
    }
}