class Solution { 
    public void reverse(int nums[],int left,int right){
        while(left<right){
           int temp= nums[left];
           nums[left]=nums[right];;
           nums[right]=temp;
           left++;
           right--;
        }
        System.out.print(Arrays.toString(nums));
    }
    public void nextPermutation(int[] nums){
        int size=nums.length;
            int i=size-2;
        while(i>=0&& nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){ 
       int j=size-1;
       while(nums[j]<=nums[i]){
        j--;
       }
             int temp=nums[i];
             nums[i]=nums[j];
             nums[j]=temp;
        }
       reverse(nums,i+1,size-1);
    }
}

