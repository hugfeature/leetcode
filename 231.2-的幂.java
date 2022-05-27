/*
 * @Author: 丑牛
 * @Date: 2021-10-10 17:02:28
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-10-10 17:04:07
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=231 lang=java
 *
 * [231] 2 的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n&(n - 1)) == 0;
    }
}
// @lc code=end

