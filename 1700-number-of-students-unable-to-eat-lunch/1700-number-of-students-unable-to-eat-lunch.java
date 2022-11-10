class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
      Queue<Integer>q=new LinkedList<>();
            for(int i=0;i<n;i++)
                q.offer(students[i]);
       int top=0;
        int cnt=0;
        while(!q.isEmpty() && cnt!=q.size())
        {
            
            if(q.peek()!=sandwiches[top])
            {
               
                q.offer(q.poll());
                cnt++;
            }
            
                else
                {
                   cnt=0;  
                    q.poll();
                    top++;
                }
        }
        return q.size();
    }
}