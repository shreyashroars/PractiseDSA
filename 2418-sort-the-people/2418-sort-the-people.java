class Solution {
    public String[] sortPeople(String[] names, int[] height) {
      String arr[]=new String[1000001];
        for(int i=0;i<names.length;i++)
        {
           arr[height[i]]=names[i];
        }
        String[]ar=new String[names.length];
        Arrays.sort(height);
        for(int i=height.length-1;i>=0;i--)
        {
           ar[height.length-1-i]= arr[height[i]];
        }
        return ar;
    }
}