/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {

    public int fun(int[] nums, int low, int high, int target) {
        int ret = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ret = mid;
                return ret;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            }
            if (nums[mid] < target) {
                low = mid +1;
            }
        }
        return ret;
    }

    public int search(int[] nums, int target) {
        return fun(nums, 0, nums.length - 1, target);
    }
    
    public static void main(String[] args) {
        int[] k = {-1,0,3,5,9,12};
        new Solution().search(k, 5);
    }
}
// @lc code=end

