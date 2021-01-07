package com.destiny.leetcode.num1120;

/**
 * @author zhuhaifeng
 * @since 2020-07-15
 * 矩阵是否包含某个路径
 */
public class Number12 {
    public static void main(String[] args) {
        int[][] list = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24}
        };
        int[] key = new int[]{4,8,16,14};
        int rows = list.length;
        int columns = list[0].length;
        boolean res = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                 res = dfs(list, i, j, key, 0);
            }
        }
        System.out.println(res);
     }
     //深度优先搜索
    static boolean dfs(int[][] list, int rows, int columns, int[] key, int index) {
        if (rows < 0 || columns < 0 || rows > list.length-1 || columns > list[rows].length - 1 || index > key.length-1 || list[rows][columns] != key[index]) {
            return false;
        }
        if (index == key.length -1) {
            return true;
        }
        //进入这里表示已经在改路径,进行标记,防止重复进入
        list[rows][columns] = Integer.MAX_VALUE;
        boolean res = dfs(list, rows + 1, columns, key, index + 1) || dfs(list, rows, columns + 1, key, index + 1)
                      || dfs(list, rows - 1, columns, key, index + 1) || dfs(list, rows, columns - 1, key,index + 1);
        list[rows][columns] = Integer.MAX_VALUE;
        return res;
    }

}