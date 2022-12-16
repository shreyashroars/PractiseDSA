class Solution {
    public int even_d(int n)
    {
        int c=0;
        while(n>0)
        {
           int r=n%10;
            n=n/10;
            c++;
        }
        return c%2==0?1:0;
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