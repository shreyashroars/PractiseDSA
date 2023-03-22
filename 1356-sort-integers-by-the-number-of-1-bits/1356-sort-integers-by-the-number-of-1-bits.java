class Solution {
    public int[] sortByBits(int[] arr) {
       Integer ar[]=new Integer[arr.length];
        Arrays.sort(arr);
        Arrays.setAll(ar,i-> arr[i]);
        customSort(ar);
        Arrays.setAll(arr,i->ar[i]);
        return arr;
    }
    public Integer[] customSort(Integer[] ar) {
        Arrays.sort(ar,new Comparator<Integer>()
                    {
                        @Override
                        public int compare(Integer a,Integer b)
                        {
                            int c1=Integer.bitCount(a);
                            int c2=Integer.bitCount(b);
                            if(c1==c2)
                            {
                                if(a>b)
                                    return 1;
                                else
                                    return -1;
                            }
                            else
                            {
                                if(c1>c2)
                                    return 1;
                                else
                                    return -1;
                            }
                                
                        }
                        
                    });
        return ar;
    }
}