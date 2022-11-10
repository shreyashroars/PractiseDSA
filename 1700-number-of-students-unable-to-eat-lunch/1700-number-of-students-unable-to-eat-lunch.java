class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
      ArrayDeque<Integer>q=new ArrayDeque<>();
    Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--)
            s.push(sandwiches[i]);
            for(int i=0;i<n;i++)
                q.offer(students[i]);
        int arr[]=new int[2];
        int cnt=0;
        while(!q.isEmpty() && cnt!=q.size())
        {
            
            if(q.peekFirst()!=s.peek())
            {
               
                q.offer(q.poll());
                cnt++;
            }
            
                else
                {
                   cnt=0;  
                    q.poll();
                    s.pop();
                }
        }
        return q.size();
    }
}