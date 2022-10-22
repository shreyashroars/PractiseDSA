class Solution {
    public String pref(String a,String b)
    {
        int i=0;
        String comm="";
        int c=a.length()<b.length()?a.length():b.length();
        while(i<c)
        {
            if(a.charAt(i)==b.charAt(i))
            {
                comm+=a.charAt(i);
                i++;
            } 
            else
                break;
        }
        return comm;
    }
    public String longestCommonPrefix(String[] strs) {
        String comm=strs[0];
        for(int i=1;i<strs.length;i++)
        {
           comm= pref(comm,strs[i]);
        }
        return comm;
    }
}