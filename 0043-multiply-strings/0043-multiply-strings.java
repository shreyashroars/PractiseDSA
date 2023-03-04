class Solution {
    public String multiply(String num1, String num2) {
         if(num1.equals("0")||num2.equals("0"))
             return "0";
         int arr[]=new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--)
        {
            for(int j=num2.length()-1;j>=0;j--)
            {
                arr[i+j+1]+=(int)(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                arr[i+j]+=arr[i+j+1]/10;
                arr[i+j+1]=arr[i+j+1]%10;
            }
        }
        String s="";
        int i=0;
      for( i=0;i<arr.length;i++)
         if(arr[i]!=0)
             break;
        while(i<arr.length)
            s+=arr[i++];
        return s;
            
    }
}