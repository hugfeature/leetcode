/*
 * @Author: 丑牛
 * @Date: 2021-09-25 10:51:52
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-09-25 11:02:22
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
// @lc code=end
