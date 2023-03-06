class Solution {
    public int findKthPositive(int[] arr, int k) {
      int org[]=new int[10000];
        for(int i=0;i<arr.length;i++)
            org[arr[i]]=-1;
        int y=0;
        int i=1;
        while(true)
        {
            if(org[i]==0)
                y++;
            if(y==k)
                break;
            i++;
        }
        return i;
    }
}