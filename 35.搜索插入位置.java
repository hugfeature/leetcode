/*
 * @Author: 丑牛
 * @Date: 2021-11-23 08:27:46
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-11-23 08:44:33
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while(left <= right){
            int mid = ((right - left) >> 1) + left;
            if( target <= nums[mid]){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}
// @lc code=end

