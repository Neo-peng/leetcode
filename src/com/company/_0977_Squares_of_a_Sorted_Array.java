package com.company;

public class _0977_Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        int r = nums.length - 1;
        int l = 0;
        int pos = r;
        int[] ans = new int[r+1];
        while (l < r) {
            if (nums[l] * nums[l] <= nums[r] * nums[r]) {
                ans[pos] = nums[r] * nums[r];
                pos--;
                r--;
            } else {
                ans[pos] = nums[l] * nums[l];
                pos--;
                l++;
            }
        }
        return ans;
    }
}
