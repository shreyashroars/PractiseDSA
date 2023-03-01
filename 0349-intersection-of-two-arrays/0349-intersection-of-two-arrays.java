class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    // Arrays.sort(nums1);
    //     Arrays.sort(nums2);
    //     if()
        HashSet<Integer>h=new HashSet<>();
         HashSet<Integer>m=new HashSet<>();
        for(int x:nums1)
            h.add(x);
        for(int i=0;i<nums2.length;i++)
        {
            if(h.contains(nums2[i]))
                m.add(nums2[i]);
        }
        int arr[]=new int[m.size()];
        int i=0;
        for(int x:m)
        {
            arr[i]=x;
            i++;
        }
         return arr;   
    }
}