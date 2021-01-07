package com.destiny.leetcode.num310;

/**
 * @author zhuhaifeng
 * @since 2020-06-15
 */
public class Number4 {
    public static void main(String[] args) {
        int[][] list = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int key = 15;
        isContainsKey(list, key);
    }

    public static boolean isContainsKey(int[][] list, int number) {
        int rows = list.length;
        int columns = list[0].length;

        return false;
    }
}
