class Solution {
    public String addBinary(String a, String b) {
        int i=0,carry=0;
         String ans="";
        while(i<a.length()||i<b.length()||carry!=0)
        {
            int x=0;
            if(i<a.length()&& a.charAt(a.length()-1-i)=='1')
                x=1;
            int y=0;
            if(i<b.length()&& b.charAt(b.length()-1-i)=='1')
                y=1;
           
            ans=(x+y+carry)%2+ans;
            carry=(x+y+carry)/2;
            i++;
            
        }
        return ans;
    }
}