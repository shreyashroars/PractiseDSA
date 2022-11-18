class Solution {
    public String removeDuplicates(String stt) {
    char ch[]=stt.toCharArray();
        String st="";
        Stack<Character>s=new Stack<>();
    for(int i=0;i<stt.length();i++)
    {
        if(s.isEmpty()|| Character.compare(s.peek(),ch[i])!=0)
        {
            s.push(ch[i]);
            continue;
        }
        while(!s.isEmpty()&& Character.compare(s.peek(),ch[i])==0)
            s.pop();
    }
        while(!s.isEmpty())
            st=s.pop()+st;
        return st;
    }
}