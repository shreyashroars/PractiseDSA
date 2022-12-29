class Solution {
    public String truncateSentence(String s, int k) {
      String arr[]=s.split(" "); 
        String ar="";
       for(int i=0;i<k;i++)
       {
           ar+=arr[i];
           if(i==k-1)
               break;
           ar+=" ";
       }
        return ar;
    }
}