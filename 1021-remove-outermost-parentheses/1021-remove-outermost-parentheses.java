class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        char arr[]=s.toCharArray();
       Stack<Character>st=new Stack<>();
        String d="";
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
            {
                st.push(arr[i]);
                continue;
            }
            if(!st.isEmpty() && arr[i]=='(')
            {
                f++;
                d+="(";
            }
            if(!st.isEmpty() && arr[i]==')')
            {
                f--;
                if(f>=0)
                  d+=")";
                else
                {
                    st.pop();
                    f=0;
                }
            }
           
        }
         return d;
    }
}