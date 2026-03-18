class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int arr:nums){
           set.add(arr); 
        }
        for(int arr=1;arr<=nums.length;arr++){
            if(!set.contains(arr)){
             list.add(arr);
            }
        } 
        return list;
        }
    }
