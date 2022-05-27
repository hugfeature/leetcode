/*
 * @Author: 丑牛
 * @Date: 2021-10-07 08:08:51
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-10-07 09:12:46
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        for (int i = 1; i < n; ++i) {
            ans += Math.max(0, prices[i] - prices[i - 1]);
        }
        return ans;
    }
}
// @lc code=end

