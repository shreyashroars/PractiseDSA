class Solution {
    public int calPoints(String[] op) {
        int n=op.length;
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(op[i].equals("C") || op[i].equals("D") || op[i].equals("+"))
            {
                 if(op[i].equals("C"))
                        s.pop();
                    else if(op[i].equals("D"))
                    {
                       s.push(2*(s.peek()));
                        
                    }
                    else
                    {
                        int op1=s.pop();
                        int y=s.peek();
                        s.push(op1);
                        s.push(y+op1);   
                    }
                }
                else
                {
                    s.push(Integer.parseInt(op[i]));
                }
                   
        }
        int sum=0;
        while(!s.isEmpty())
        {
            sum+=s.pop();
        }
        return sum;
    }
}