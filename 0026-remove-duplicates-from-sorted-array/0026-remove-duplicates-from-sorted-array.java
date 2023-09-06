class Solution {
    public int removeDuplicates(int[] arr) {
         int n=arr.length;
       // int j=1;
       //  for(int i=1;i<n;i++)
       //  {
       //      if(arr[i]!=arr[i-1])
       //          arr[j++]=arr[i];
       //  }
       //  return j; 
        int f1=0;
		for(int i=1;i<n;i++)
		{
			if(arr[i]!=arr[f1])
			{
				f1++;
				arr[f1]=arr[i];
			}
		}
		return f1+1;
        
    }
}