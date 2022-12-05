class Solution {
    public double average(int[] salary) {
        int min=10000000,max=1;
        double s=0.00;
       for(int i=0;i<salary.length;i++) 
       {
           if(min>salary[i])
               min=salary[i];
           if(max<salary[i])
               max=salary[i];
       }
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]!=max && salary[i]!=min)
                s+=salary[i];
        }
        return s/(double)(salary.length-2);
    }
}