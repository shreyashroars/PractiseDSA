class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        HashSet<List<Integer>>h=new HashSet<>();
        for(int i=0;i<n-3;i++)
        {
            for(int j=i+1;j<n-2;j++)
            {
                int k=j+1;
                int l=n-1;
                while(k<l)
                {
                    long x1=arr[i]+arr[j];
                    long x2=arr[k]+arr[l];
                    long x=x1+x2;
                    if(x==target)
                    {
                        List<Integer>ans1=new ArrayList<>();   
                        ans1.add(arr[i]);
                        ans1.add(arr[j]);
                        ans1.add(arr[k]);
                        ans1.add(arr[l]);
                        if(!h.contains(ans1))
                        {
                            ans.add(ans1);
                            h.add(ans1);
                        }
                        k++;
                        l--;
                    }
                    else if(x>target)
                        l--;
                    else if(x<target)
                        k++;

                    }

                }
            }
            return ans;
        
    }
}