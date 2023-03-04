class Solution {
    public String multiply(String num1, String num2) {
         if(num1.equals("0")||num2.equals("0"))
             return "0";
        int mul=1,c=0,r=0;
        String prod="";
        for(int i=num1.length()-1;i>=0;i--)
        {
             for(int k=0;k<num1.length()-i-1;k++)
                prod="0"+prod;
            c=0;
            for(int j=num2.length()-1;j>=0;j--)
            {
                mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0')+c;
                if(j!=0)
                {
                    c=mul/10;
                    r=mul%10;
                }
               else
                   r=mul;
               prod=String.valueOf(r)+prod; 
                
            }
            prod=" "+prod;
        }
        prod=prod.trim();
        int sum;
        String arr[]=prod.split(" ");
        int y=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(y<arr[i].length())
                y=arr[i].length();
        }
         for(int i=0;i<arr.length;i++)
        {
           int cnt=y-arr[i].length();
             while(cnt>0)
             {
                 arr[i]="0"+arr[i];
                 cnt--;
             }
        }
        String sum1=arr[0];
        if(arr.length==1)
            return arr[0];
        String s="";
        for(int i=1;i<arr.length;i++)
        {
            c=0;
            s="";
         String sum2=arr[i];
         int n1=sum1.length();
            int n2=sum2.length();
            int u=(int)Math.min(n1,n2);
            if(u==n1)
            {
              int diff=n2-n1;
              while(diff>0)
              {
                  sum1="0"+sum1;
                  diff--;
              }
            }
            else
            {
            int diff=n1-n2;
              while(diff>0)
              {
                  sum2="0"+sum2;
                  diff--;
              } 
            }
            for(int k=sum1.length()-1;k>=0;k--)
        {
            //String sum2=arr[i];
            sum=(int)(sum1.charAt(k)-'0')+(int)(sum2.charAt(k)-'0')+c;
            if(k!=0)
            {
                c=sum/10;
                r=sum%10;
            }
            else
                r=sum;
            s=r+s;
          
        }
            sum1=s;
       }
        return s;
        
            
    }
}