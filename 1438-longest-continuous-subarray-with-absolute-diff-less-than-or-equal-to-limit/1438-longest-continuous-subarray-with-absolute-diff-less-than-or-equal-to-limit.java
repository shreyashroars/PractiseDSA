class Solution {
    public int longestSubarray(int[] arr, int limit) {
        ArrayDeque<Integer>maxd=new ArrayDeque<>();
        int n=arr.length;
        ArrayDeque<Integer>mind=new ArrayDeque<>();
        //Here i and j are the start and end pointers respectively
        int i=0,j;
        for(j=0;j<n;j++)
        {
            while(!maxd.isEmpty() && arr[j]>maxd.peekLast())
                maxd.pollLast();
            while(!mind.isEmpty() && arr[j]<mind.peekLast())
                mind.pollLast();
            maxd.addLast(arr[j]);
            mind.addLast(arr[j]);
            if(maxd.peekFirst()-mind.peekFirst()>limit)
            {
                if(maxd.peekFirst()==arr[i])
                    maxd.pollFirst();
                if(mind.peekFirst()==arr[i])
                    mind.pollFirst();
                i++;
            } 
        }
        return j-i;
    }
}