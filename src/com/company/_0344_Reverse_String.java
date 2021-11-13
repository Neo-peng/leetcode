package com.company;

public class _0344_Reverse_String {
    public void reverseString(char[] s) {
        int right = s.length - 1;
        for(int left = 0; left < right; left++, right--) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }
}
