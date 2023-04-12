class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs.length==1)
            return 1;
   //       Comparator<int[]>com=new Comparator<int[]>()
   //      {
   //        public int compare(int[] arr1,int arr2[])
   //        {
   //            if(arr1[0]>arr2[0] )
   //            return 1;
   //            else
   //                return -1;
   //        }
   //      };
   //      Arrays.sort(pairs,com);
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
      for(int i=0;i<pairs.length;i++)
   {
      System.out.println(pairs[i][0]+" "+pairs[i][1]);
   }
        int max=-1;
       
        int n=pairs.length;
       for(int i=0;i<n-1;i++)
       {
           int cnt=1;
           int t=i;
           for(int j=i+1;j<n;j++)
           {
               if(pairs[t][1]<pairs[j][0])
               {
                   t=j;
                   cnt++;
               }
                   
           }
           max=Math.max(max,cnt);
       }
        return max;
            
        
        
    }
}