class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        LinkedHashSet<Integer>h=new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
            h.add(arr[i]);
        }
        int i=0;
        for(Integer x:h)
            arr[i++]=x;
        //System.out.println(Arrays.toString(arr));
        return h.size();
        
    }
}