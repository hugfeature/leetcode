/*
 * @Author: 丑牛
 * @Date: 2021-11-03 10:49:54
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-11-03 13:49:43
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=263 lang=java
 *
 * [263] 丑数
 */

// @lc code=start
class Solution {
    public boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        } 
        return n == 1;

    }
}
// @lc code=end

