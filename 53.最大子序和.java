/*
 * @Author: 丑牛
 * @Date: 2021-09-23 09:25:59
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-09-23 09:38:01
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxAns = nums[0] ;
        for (int i : nums) {
            pre = Math.max(pre + i, i);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
// @lc code=end

