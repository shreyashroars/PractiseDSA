class Solution {
    List<Integer> getList(int a,int b,int c)
    {
        List<Integer>li=new ArrayList<>();
        li.add(a);
        li.add(b);
        li.add(c);
        Collections.sort(li);
        return li;
    }
    public List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        HashSet<List<Integer>>visited=new HashSet<>();
        List<List<Integer>>ans=new ArrayList<>();
         for(int i=0;i<n-1;i++)
        {
            HashSet<Integer>h=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int x=-(arr[i]+arr[j]);
                if(h.contains(x))
                {
                    List<Integer>al=getList(arr[i],x,arr[j]);
                    if(!visited.contains(al))
                    {
                       ans.add(al);
                        visited.add(al); 
                    }
                        
                } 
                else
                {
                    h.add(arr[j]);
                    
                }
            }
        }
        return ans;
        
    }
}