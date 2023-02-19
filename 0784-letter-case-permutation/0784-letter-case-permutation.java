class Solution {
    public List<String> letterCasePermutation(String s) {
        Queue<String>q=new LinkedList<>();
        q.offer(s);
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                continue;
            int q_size=q.size();
            for(int j=0;j<q_size;j++)
            {
                String curr=q.poll();
                char[]ch_arr=curr.toCharArray();
                ch_arr[i]=Character.toUpperCase(ch_arr[i]);
                q.offer(String.valueOf(ch_arr));
                ch_arr[i]=Character.toLowerCase(ch_arr[i]);
                q.offer(String.valueOf(ch_arr));
                
            }
        }
        return new LinkedList<>(q);
    }
}