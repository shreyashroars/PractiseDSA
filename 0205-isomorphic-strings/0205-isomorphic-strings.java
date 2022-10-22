class Solution {
    public boolean isIsomorphic(String str1, String str2) {
       HashMap<Character,Character>m=new HashMap<>();
       for(int i=0;i<str1.length();i++)
       {
           if(!m.containsKey(str1.charAt(i)))
          {
              if(m.containsValue(str2.charAt(i)))
              return false;
              m.put(str1.charAt(i),str2.charAt(i));
          }
          else if(m.containsKey(str1.charAt(i)) && m.get(str1.charAt(i))!=str2.charAt(i))
           return false;
       }
       return true;
    }
}