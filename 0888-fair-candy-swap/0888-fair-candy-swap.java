class Solution {
    public int[] fairCandySwap(int[] arr1, int[] arr2) {
        int pSum1=arr1[0];
        int pSum2=arr2[0];
        int n1=arr1.length;
        int n2=arr2.length;
        for(int i=1;i<n1;i++)
            pSum1+=arr1[i];
        for(int i=1;i<n2;i++)
            pSum2+=arr2[i];
        for(int i=0;i<n1;i++)
        {
            pSum1=pSum1-arr1[i];
            for(int j=0;j<n2;j++)
            {
                 pSum2=pSum2-arr2[j];
                if(pSum1+arr2[j]==pSum2+arr1[i])
                    return new int[]{arr1[i],arr2[j]};
                 pSum2+=arr2[j];
            }
            pSum1+=arr1[i];
           
        }
        return new int[2];
        
    }
}