class Solution {
    public int[] finalPrices(int[] arr) {
        int n=arr.length;
       int ar[]=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()>arr[i])
                s.pop();
            int curr=s.isEmpty()?arr[i]:arr[i]-s.peek();
            ar[i]=curr;
            s.push(arr[i]);
        }
        return ar;
    }
}