package com.company;

public class _0278_First_Bad_Version {
    public int firstBadVersion(int n) {
        int left = 1, right = n, mid;
        while (left < right) {
            // 不能写成(left+right) >> 1, 因为如果left+right > 2^31 - 1,
            // 将会超过int类型的上限，从而触发错误
            mid = left + ((right - left) >> 1);
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean isBadVersion(int n) {
        return n >= 4;
    }
}
