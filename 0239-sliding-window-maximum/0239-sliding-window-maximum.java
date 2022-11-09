class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
         Deque<Integer>q=new LinkedList<>();
       // int maxi=0;
       int ar[]=new int[n-k+1];
        for(int i=0;i<k;i++)
        {
           while(!q.isEmpty() && arr[i]>=arr[q.peekLast()])
           q.removeLast();
           q.addLast(i);
        }
       // ar.add(maxi);
        int j=0;
        for(int i=k;i<n;i++)
        {
           ar[j]= arr[q.peek()];
            j++;
           while(!q.isEmpty()&& q.peek()<=i-k)
           q.removeFirst();
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()])
           q.removeLast();
           q.addLast(i);
        }
        ar[j]=arr[q.peek()];
        return ar;
    }
}