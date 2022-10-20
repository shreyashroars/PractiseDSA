class Solution {
    public int longestConsecutive(int[] arr) {
         HashSet<Integer>h=new HashSet<>();
        int N=arr.length;
	   int c=0;
	   int maxi=0;
	   for(int i=0;i<N;i++)
	   h.add(arr[i]);
	   for(int i=0;i<N;i++)
	   {
	       if(h.contains(arr[i]-1)!=true)
	       {
	           int k=arr[i];
	       while(h.contains(k)==true)
	       {
	       c++;
	       k=k+1;
	       }
	       }
	       maxi=maxi<c?c:maxi;
	       c=0;
	   }
	   return maxi;
    }
}