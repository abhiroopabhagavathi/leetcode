class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1){
            return (dividend+1)*(-1);
        }
        int d = dividend/divisor;
        return d;
    }
}