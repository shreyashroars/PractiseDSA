class Solution {
   public String decodeString(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray())
        {
            if(c != ']') 
                stack.push(c); 
            
            else 
            {
                String sub="";
                while(!stack.isEmpty() && Character.isLetter(stack.peek()))
                    sub=stack.pop()+sub;
                stack.pop(); 
                String sb="";
                while(!stack.isEmpty() && Character.isDigit(stack.peek()))
                    sb=stack.pop()+sb;
                   
                    
                int count = Integer.valueOf(sb); 
                while(count > 0)
                {
                    for(char ch : sub.toCharArray())  
                        stack.push(ch);
                    count--;
                }
            }
        }
       String str="";
        while(!stack.isEmpty())
           str=stack.pop()+str;

        return str;
    }
}