package done;

/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {

    public void fun(int[] nums, int low, int high, int tag) {
        if (low <= high) {
            int i = low;
            int j = high;
            int mid = nums[i];
            if (tag == 0) {
                mid *= mid;
                while (i < j) {
                    while (nums[j] * nums[j] > mid && i < j) {
                        nums[j] *= nums[j];
                        j--;
                    }
                    if (i < j) {
                        nums[j] *= nums[j];
                        nums[i] = nums[j];
                        i += 1;
                    }
                    while (nums[i] * nums[i] < mid && i < j) {
                        nums[i] *= nums[i];
                        i++;
                    }
                    if (i < j) {
                        nums[i] *= nums[i];
                        nums[j] = nums[i];
                        j -= 1;
                    }
                }
                nums[j] = mid;
            }else {
                while(i < j) {
                    while (nums[j] > mid && i < j) {
                        j--;
                    }
                    if (i < j) {
                        nums[i] = nums[j];
                        i += 1;
                    }
                    while (nums[i] < mid && i < j) {
                        i++;
                    }
                    if (i < j) {
                        nums[j] = nums[i];
                        j -= 1;
                    }
                }
                nums[j] = mid;  
            }
            fun(nums, low, i - 1, 1);
            fun(nums, i + 1, high, 1);
        }
    }

    public int[] sortedSquares(int[] nums) {
        fun(nums, 0, nums.length - 1, 0);
        return nums;
    }
}
// @lc code=end

