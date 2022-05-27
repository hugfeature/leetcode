/*
 * @Author: 丑牛
 * @Date: 2021-11-06 09:09:19
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-11-06 09:24:14
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        int length = s.length();
        char[] chars = s.toCharArray();
        int index = 0;
        while (index < length && chars[index] == ' ') {
            index ++;
        }
        if(index == length){
            return 0;
        }
        int sign = 1;
        char firstChar = chars[index];
        if (firstChar == '+') {
            index ++;
        } else if (firstChar == '-') {
            index ++ ;
            sign = -1;
        }
        int res = 0;
        while (index < length) {
            char currChar = chars[index];
            if (currChar > '9' || currChar < '0') {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (currChar - '0');
            index ++;          
        }
        return res;
    }
}
// @lc code=end

