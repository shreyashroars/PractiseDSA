class Solution {
    public String minWindow(String s, String t) {
       int i=0,j=0,start=0;
        int n=s.length();
        int min=1000000,temp=min;
        HashMap<Character,Integer>m=new HashMap<>();
        char ch[]=s.toCharArray();
        for(char c: t.toCharArray())
            m.put(c,m.getOrDefault(c,0)+1);
        int count=m.size();
        while(j<n)
        {
            if(m.containsKey(ch[j]))
            {
             m.put(ch[j],m.getOrDefault(ch[j],0)-1);
            if(m.get(ch[j])==0)
                count--;   
            }     
            if(count>0)
                j++;
            if(count==0)
            {
                temp=min;
                min=Math.min(min,j-i+1);
                if(temp!=min)
                start=i;
                while(count==0)
                {
                    if(m.containsKey(ch[i]))
                    {
                       m.put(ch[i],m.getOrDefault(ch[i],0)+1);  
                         if(m.get(ch[i])==1)
                        count++;
                    }
                    
                    i++;
                     if(count==0)
                    {
                         temp=min;
                        min=Math.min(min,j-i+1);
                         if(temp!=min)
                        start=i;
                    }
                }
                j++;
            }
        }
        if(min==1000000)
            return "";
        return s.substring(start,start+min);
    }
}