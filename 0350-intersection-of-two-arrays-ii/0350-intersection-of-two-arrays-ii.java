class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer>m=new HashMap<>();
        for(int x:nums1)
            m.put(x,m.getOrDefault(x,0)+1);
        int i=0;
        int arr[]=new int[1000];
        for(int x:nums2)
            if(m.containsKey(x))
            {
                if(m.get(x)>1)
                    m.put(x,m.get(x)-1);
                else
                    m.remove(x);
                arr[i++]=x;
                
            }
        int k=0;
        int ar[]=new int[i];
        for(int z=0;z<i;z++)
        {
            ar[k]=arr[z];
            k++;
        }
        return ar;
    }
}