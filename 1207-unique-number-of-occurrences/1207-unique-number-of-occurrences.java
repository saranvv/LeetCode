class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
       List<Integer> li=new ArrayList<Integer>();
         int count=1;
        for(int i=1;i<n;i++){
            
            if(arr[i-1]==arr[i]){
                count++;
            }
            else{
                 li.add(count);
                count=1;
            }
         
        }
           li.add(count);
       Collections.sort(li);
       System.out.println(li.size());
       int i;
        for( i=0;i<li.size();i++)
        {
             
             //System.out.println(li.get(i)+" "+i);
             if(i!=0)
             {
                int val1=li.get(i-1);
                int val2=li.get(i);
                //System.out.println(val1 +" "+val2);
        
               // if(li.get(i-1) == li.get(i)) 
                if(val1==val2)
                {
                    System.out.println("true");
                    return false;
                }
             }
        }
       // System.out.println("tr"+" "+i);
        return true;
    }
}