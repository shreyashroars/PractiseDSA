class Solution {
    public int strStr(String s, String p) {
      int n=s.length();
	    int m=p.length();
	    int i=m-1;
	    int shift_table[]=new int[26];
	    Arrays.fill(shift_table,m);
	    for(int j=m-2;j>=0;j--)
	    {
	        if(shift_table[p.charAt(j)-'a']==m)
	        shift_table[p.charAt(j)-'a']=m-j-1;
	    }
       // int i;
        int pos=0;
         while(i<n)
        {
           int k=0;
            while((k<m) && (p.charAt(m-1-k) == s.charAt(i-k)))
              k++;
           if(k==m) 
     {       pos=i-m+1;
               return pos;
     } 
           else
               i+=shift_table[s.charAt(i)-'a'];
        }
        return -1;
  }
}