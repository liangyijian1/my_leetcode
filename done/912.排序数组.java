/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 */

// @lc code=start
class Solution {
    public int[] fun(int[] nums, int low, int high) {
        if (low < high) {
            int i = low;
            int j = high;
            int mid = nums[i];
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
            fun(nums, low, i - 1);
            fun(nums, i + 1, high);
        }
        return nums;
    }

    public int[] sortArray(int[] nums) {
        nums = fun(nums, 0, nums.length - 1);
        return nums;
    }


}
// @lc code=end

