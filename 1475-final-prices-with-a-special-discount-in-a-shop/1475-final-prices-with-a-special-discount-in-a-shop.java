class Solution {
    public int[] finalPrices(int[] arr) {
        int n=arr.length;
        if(n==1)
            return arr;
        int i=0;
      while(i<n-1)
      {
          int j=i+1;
          while(j<n && arr[j]>arr[i])
              j++;
          if(j<n)
              arr[i]-=arr[j];
          i++;
      }
        return arr;
    }
}