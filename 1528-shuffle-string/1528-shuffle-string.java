class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        String st="";
        char arr[]=new char[n];
        for(int i=0;i<n;i++)
        {
            arr[indices[i]]=s.charAt(i);
        }
       for(char x:arr)
           st+=x;
        return st;
    }
}