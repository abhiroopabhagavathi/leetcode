class Solution {
    void rev(char arr[],int start,int end){
        while(start<end){ 
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
   
    }

    public String reverseWords(String s) {
        char[] kubish=s.toCharArray();
        int n=kubish.length;
        int start =0;
        for(int i=0;i<n;i++){
            if(kubish[i]==' '||i==n-1){
                int end=kubish[i]==' '?i-1:i;
                    rev(kubish,start,end);
                    start=i+1;
            }
       
        }
         return new String(kubish);
    }
}