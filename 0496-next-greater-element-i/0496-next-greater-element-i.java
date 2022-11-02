class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] arr) {
        int n=arr.length;
         int ar[]=new int[10001];
       Deque<Integer>s=new ArrayDeque<>();
       s.push(arr[n-1]);
       for(int i=n-1;i>=0;i--)
       {
           while(s.isEmpty()==false && s.peek()<=arr[i])
           s.pop();
           int res=s.isEmpty()?-1:s.peek();
           ar[arr[i]]=res;
           s.push(arr[i]);
       }
        int arr1[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            arr1[i]=ar[nums1[i]];
        }
       return arr1;
    } 
    }
