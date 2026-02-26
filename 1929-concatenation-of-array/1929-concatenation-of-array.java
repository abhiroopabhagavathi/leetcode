class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] arr=new int[nums.length*2];
        int half=arr.length/2;
        for(int i=0;i<half;i++)
        {
            arr[i]=nums[i];
        }
        int j=0;
        for(int i=half;i<arr.length;i++)
        {
            arr[i]=nums[j];
            j++;
        }
        return arr;

    }
}