class Solution {
    public int even_d(int n)
    {
       String s=String.valueOf(n);
       return s.length()%2==0?1:0; 
    }
    public int findNumbers(int[] nums) {
        int sum=0;
      for(int i=0;i<nums.length;i++)
      {
          sum+=even_d(nums[i]);
      }
        return sum;
    }
}