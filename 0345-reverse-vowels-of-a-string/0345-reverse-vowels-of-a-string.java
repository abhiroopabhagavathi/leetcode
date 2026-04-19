class Solution {
    public String reverseVowels(String s) {
        char[] ar = s.toCharArray();
        int left = 0, right = ar.length - 1;

        while (left < right) {
            while (left < right && !isVowel(ar[left])) left++;
            while (left < right && !isVowel(ar[right])) right--;

            char temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;

            left++;
            right--;
        }
        return new String(ar);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}