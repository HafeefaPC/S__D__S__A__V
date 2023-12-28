package binarysearch;

import java.util.Arrays;

public class range {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 7, 7, 22, 31, 35 };
        int target = 7;
        System.out.println(Arrays.toString(searchindex(nums, target)));
    }

    public static int[] searchindex(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        if (ans[0] != -1){
        ans[1] = search(nums, target, false);
        }
        return ans;
    }

    public static int search(int[] nums, int target, boolean index) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (index) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
