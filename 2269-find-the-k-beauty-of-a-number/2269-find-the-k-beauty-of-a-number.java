class Solution {
    public int divisorSubstrings(int num, int k) {
        String st=String.valueOf(num),s="";
        char ch[]=st.toCharArray();
        int n=st.length(),c=0;
     int j=0;
        while(j<n)
        {
          s+=ch[j];
            if(s.length()<k)
                j++;
            else if(s.length()==k)
            {
                int x=Integer.parseInt(s);
                if(x!=0 && num%x==0)
                    c++;
                s=s.substring(1);
                j++;
            }
        }
        return c;
    }
}