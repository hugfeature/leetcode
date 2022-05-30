/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int sigle = 0;
        for (int i : nums) {
            sigle ^= i;
        }
        return sigle;
    }
}
// @lc code=end

