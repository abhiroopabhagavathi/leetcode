class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        String res="";
        int copy=num;
        num=Math.abs(num);
       while(num!=0) {
        int rem=num%7;
        res=rem+res;
        num=num/7;
       }
       if(copy<0){
        return "-"+res;
       }
       return res;
    }
}