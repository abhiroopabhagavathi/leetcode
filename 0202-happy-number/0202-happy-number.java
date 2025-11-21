class Solution {
    public static int sq(int n){
        int sq=0;
        while(n>0){
            int dig=n%10;
            sq+=dig*dig;
            n/=10;
        }
        return sq;
    }
    public static boolean  happy(int n){
         HashSet<Integer> ht= new HashSet<>();
         while(true){
            int ans=sq(n);
            if(ans==1){
                return true;
            }
            if(ht.contains(ans)){
                return false;
            }
            ht.add(ans);
            n=ans;
         }
    }
    public boolean isHappy(int n) {
       boolean happynum=happy(n);
       return happynum;
    }
}