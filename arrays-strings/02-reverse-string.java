class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}

/*
Local test cases:
1. s = ['h','e','l','l','o'] -> ['o','l','l','e','h']
2. s = ['H','a','n','n','a','h'] -> ['h','a','n','n','a','H']
*/