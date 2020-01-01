/*
Java solution for Leetcode #153 - Find Minimum in Rotated Sorted Array

faster than 100%
*/
import java.lang.*;

class Solution {
    public int findMin(int[] nums) {

        if (nums.length == 2) {
            if (nums[0] > nums[1]) {
                return nums[1];
            } else {
                return nums[0];
            }
        }
        boolean corner_case = true;
        for (int k = 1; k < nums.length; k++) {
            if (nums[k] < nums[0]) {
                corner_case = false;
            }
        }
        if (corner_case == true) {
            return nums[0];
        }

        int i = 0;
        int j = nums.length - 1;
        int curr = (int)Math.floor((i + j) / 2);

        while (i < j) {
            if (nums[curr] >= nums[0]) {
                i = curr + 1;
            } else if (nums[curr] < nums[0]) {
                j = curr;
            }
            curr = (int)Math.floor((i + j) / 2);
        }
        return nums[i];
    }
}
