/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void merge(int l,int m,int h,ArrayList<Integer>arr)
    {
        int n1 = m - l + 1;
        int n2 = h - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for (int i = 0; i < n1; ++i)
            L[i] = arr.get(l + i);
        for (int j = 0; j < n2; ++j)
            R[j] = arr.get(m + 1 + j);
  
      
       
        int i = 0, j = 0;
  
      
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr.set(k,L[i]);
                i++;
            }
            else {
                arr.set(k,R[j]);
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr.set(k,L[i]);
            i++;
           k++;
        }
        while (j < n2) {
            arr.set(k,R[j]);
            j++;
            k++;
        }
    }
    public void mergeSort(int l,int h,ArrayList<Integer>arr)
    {
        if(l<h)
        {
            int m=l+(h-l)/2;
            mergeSort(l,m,arr);
            mergeSort(m+1,h,arr);
            merge(l,m,h,arr);
        }
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        ArrayList<Integer>arr=new ArrayList<>();
        for(ListNode x:lists)
        {
           while(x!=null)
           {
               arr.add(x.val);
               x=x.next;
           }
    }
        if(arr.isEmpty())
            return null;
        mergeSort(0,arr.size()-1,arr);
        ListNode r=new ListNode(0);
        ListNode a=new ListNode(0);
          ListNode b=new ListNode(0);
        
        for(int i=0;i<arr.size();i++)
        {
           r.val=arr.get(i);
            if(i==0)
                a=r;
            if(i<arr.size()-1)
            {
           r.next=new ListNode(0);    
            r=r.next;
            }
        }
        return a;
        
    }
}