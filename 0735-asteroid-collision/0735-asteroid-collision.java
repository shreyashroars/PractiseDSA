class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n=arr.length;
        Deque<Integer>s=new ArrayDeque<>();
        for(int a:arr)
        {
            while(!s.isEmpty() && a<0 && s.peek()>0)
            {
                int diff=a+s.peek();
                if(diff<0)
                {
                    s.pop();
                }
                else if(diff>0)
                    a=0;
                else
                {
                    a=0;
                    s.pop();
                }
            }
            if(a!=0)
            s.push(a);
        }
         int z=s.size();
        int ar[]=new int[z];
        
        for(int i=0;i<z;i++)
        {
       // System.out.println(s.peek());
          ar[z-1-i]=s.pop();
        }
        return ar;
    }
    
}