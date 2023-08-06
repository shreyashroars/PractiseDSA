class Pair
{
    int val;
    int ind;
    Pair(int x,int y)
    {
        val=x;
        ind=y;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Comparator com=new Comparator<Pair>()
        {
            public int compare(Pair a,Pair b)
            {
                if(a.val>b.val)
                    return 1;
                else if(a.val<b.val)
                    return -1;
                else
                    return 0;
            }
        };
        int[]arr=new int[2];
         int n=nums.length;
        Pair[]arr1=new Pair[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=(new Pair(nums[i],i));
        }
        Arrays.sort(arr1,com);
        int l=0;
        int r=n-1;
        while(l<r)
        {
            if(arr1[l].val+arr1[r].val<target)
                l++;
            else if(arr1[l].val+arr1[r].val>target)
                r--;
            else 
            {
                arr[0]=arr1[l].ind;
                arr[1]=arr1[r].ind;
                return arr;
            }
        }
        return arr;
    }
}