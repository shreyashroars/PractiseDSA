class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer>s=new ArrayDeque<>();
        int n=nums.length;
      for(int i=n-2;i>=0;i--)
      {
          if(nums[i]>nums[n-1])
              s.push(nums[i]);
      }
        int arr[]=new int[n];
        arr[n-1]=s.isEmpty()?-1:s.peek();
         s.push(nums[n-1]);
      for(int i=n-2;i>=0;i--)
      {
          while(!s.isEmpty() && s.peek()<=nums[i])
              s.pop();
          int t=s.isEmpty()?-1:s.peek();
          arr[i]=t;
          s.push(nums[i]);
      }
        return arr;
          
    }
}