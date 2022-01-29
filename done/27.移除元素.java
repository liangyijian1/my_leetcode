package done;

/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public void fun(int[] nums, int idx) {
        while (idx < nums.length - 1) {
            nums[idx] = nums[idx + 1];
            idx++;
        }
    }

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int i = 0;
        while (i < length) {
            if (nums[i] == val) {
                fun(nums, i);
                i--;
                length--;
            }
            i++;
        }
        return length;
    }

    /**
     * 官方双指针解法：
     *  题目说顺序可以改变，删除元素直接用最后一个元素替换就可以，这样子就是循环一遍
     * 
     * class Solution {
        public int removeElement(int[] nums, int val) {
            int left = 0;
            int right = nums.length;
            while (left < right) {
                if (nums[left] == val) {
                    nums[left] = nums[right - 1];
                    right--;
                } else {
                    left++;
                }
            }
        return left;
    }

}
     */

   
}
// @lc code=end

