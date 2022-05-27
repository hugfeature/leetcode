/*
 * @Author: 丑牛
 * @Date: 2021-09-17 09:37:19
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-09-17 10:09:23
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }
}
// @lc code=end
