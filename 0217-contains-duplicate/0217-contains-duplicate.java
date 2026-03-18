class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> abhi=new HashSet<>();
       for(int i:nums){
        if(!abhi.add(i)){
            return true;
        }
       }
       return false;
            }
}