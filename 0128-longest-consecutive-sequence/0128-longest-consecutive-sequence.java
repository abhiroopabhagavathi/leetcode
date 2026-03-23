class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int max=1;
        if(nums.length==0) {
            return 0;
        }
        for(int val:nums)
        {
             set.add(val);
        }
      for(int value : set){
    if(!set.contains(value - 1)){   
        int count = 1;
        int current = value;

        while(set.contains(current + 1)){
            count++;
            current++;
        }

        max = Math.max(max, count);
    }
}  
return max;
    }
}