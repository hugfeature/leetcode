/*
 * @Author: 丑牛
 * @Date: 2021-09-15 10:21:45
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-09-15 11:10:07
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        /**
         * 负数不是回文字符，末位是0的，必须首位也为0,只有0是回文数
         */
        if ( x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int revertesNum = 0;
        while (x > revertesNum){
            revertesNum = revertesNum * 10 + x % 10;
            x /=10;
        }
         // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。中位数字不影响判断，直接去掉即可
        return  x == revertesNum || x == revertesNum/10;
    }
}
// @lc code=end

