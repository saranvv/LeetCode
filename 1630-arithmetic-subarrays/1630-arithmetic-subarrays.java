class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> li=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            boolean bool=false;
            int[] arr=Arrays.copyOfRange(nums,l[i],r[i]+1);
            Arrays.sort(arr);
            int t=arr[1]-arr[0];
            for(int j=1;j<arr.length;j++){
                if(arr[j]-arr[j-1]!=t) bool=true;
            }
            if(bool) li.add(false);
            else li.add(true);
        }
        return li;
    }
}