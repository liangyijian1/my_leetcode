/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int min = 0;
        int length = nums.length;
        while (i <= length - 1) {
            if (nums[i] >= target) {
                i++;
                return 1;
            }
            int temp = 0;
            int j = i;
            while (temp < target && j < length) {
                temp = temp + nums[j++];
            }
            if (j == length && min == 0 && temp < target) {
                return 0;
            }
            if (min == 0) {
                min = j - i;
            }
            if ((j - i) < min && temp >= target) {
                min = j - i;
            }
            i++;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] k = {1,1,1,1,7};
        System.out.println(new Solution().minSubArrayLen(7, k));
    }
}
// @lc code=end

