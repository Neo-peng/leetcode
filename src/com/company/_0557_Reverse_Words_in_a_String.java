package com.company;

public class _0557_Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int right = 0;
        int n = s.length();
        while (right < n) {
            int left = right;
            while (right < n && s.charAt(right) != ' ') {
                right++;
            }
            for ( int p = left; p < right; p++ ) {
                ans.append(s.charAt(right + left - p));
            }
            while (right < n && s.charAt(right) == ' ') {
                ans.append(' ');
                right++;
            }
        }
        return ans.toString();
    }
}
