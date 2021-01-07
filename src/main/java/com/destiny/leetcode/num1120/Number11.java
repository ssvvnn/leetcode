package com.destiny.leetcode.num1120;

/**
 * @author zhuhaifeng
 * @since 2020-07-13
 * 旋转数组的最小值,与二分查找类似
 */
public class Number11 {
    public static void main(String[] args) {
        int[] list = new int[]{1,2,2,2,3,0,1};
//        int n = 16;
//        n |= n >>> 1;
//        System.out.println(1 << 4);
//        System.out.println(n);
//        n |= n >>> 2;
//        n |= n >>> 4;
//        n |= n >>> 8;
//        n |= n >>> 16;
//        System.out.println(n);
        System.out.println(minValue(list));
    }
    static int minValue(int[] list) {
        int i = 0;
        int j = list.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (list[m] > list[j]) {
                i = m + 1;
            } else if (list[m] < list[j]) {
                j = m;
            } else {
                j = j - 1;
            }
        }
        return list[i];
    }
}
