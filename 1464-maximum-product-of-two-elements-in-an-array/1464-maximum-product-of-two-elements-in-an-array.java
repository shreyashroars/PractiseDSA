class Solution {
    public int maxProduct(int[] arr) {
       PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:arr)
            pq.add(x);
        return (pq.poll()-1)*(pq.poll()-1);
        
    }
}