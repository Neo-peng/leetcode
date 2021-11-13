package com.company;

public class _0035_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length, mid;
        while (l < r) {
            mid = l + ((r - l) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        return l;
    }
}
