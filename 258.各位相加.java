/*
 * @Author: 丑牛
 * @Date: 2021-10-10 17:10:45
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-10-10 17:12:30
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        //能够被9整除的整数，各位上的数字加起来也必然能被9整除，所以，连续累加起来，最终必然就是9。
        //不能被9整除的整数，各位上的数字加起来，结果对9取模，和初始数对9取摸，是一样的，所以，连续累加起来，最终必然就是初始数对9取摸。
        return (num - 1) % 9 + 1;
    }
}
// @lc code=end

