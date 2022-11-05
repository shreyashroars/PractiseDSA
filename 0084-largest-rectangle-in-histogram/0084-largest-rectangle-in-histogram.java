class Solution {
    public static int max(int a,int b)
    {
        if(a<b)
            return b;
        return a;
    }
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int res=0,curr;
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                int t=s.pop();
                curr=arr[t]*(s.isEmpty()?i:i-s.peek()-1);
                res=max(res,curr);
            }
            s.push(i);
        }
        while(!s.isEmpty())
        {
            int t=s.pop();
            curr=arr[t]*(s.isEmpty()?n:n-s.peek()-1);
            res=max(res,curr);
        }
        return res;
       
    }
}