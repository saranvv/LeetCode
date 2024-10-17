class Solution {
    public List<Integer> majorityElement(int[] nums) {
         ArrayList<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        
         Set<Integer> st = map.keySet();
        for(Integer i: st){
            if(map.get(i) > nums.length/3){
                li.add(i);
            }
        }
        return li;
    }
}