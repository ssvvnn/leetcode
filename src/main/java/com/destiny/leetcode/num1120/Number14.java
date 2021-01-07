package com.destiny.leetcode.num1120;

/**
 * @author zhuhaifeng
 * @since 2020-07-27
 * 剪绳子
 */
public class Number14 {
    public static void main(String[] args) {
        System.out.println(cutScope(4));
        System.out.println(cutScope(5));
        System.out.println(cutScope(6));
        System.out.println(cutScope(7));
        System.out.println(cutScope(8));
        System.out.println(cutScope(9));
        System.out.println(cutScope(10));
    }
    //贪心算法,自下而上
    public static int cutScope(int number) {
        if (number == 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        }
        if (number == 3) {
            return 2;
        }
        int[] list = new int[number + 1];
        list[0] = 0;
        list[1] = 1;
        list[2] = 2;
        list[3] = 3;
        int temp = 0;
        int max = 0;
        for (int i = 4; i <= number; i++) {
            max = 0;
            for (int j = 1; j <= i / 2; j++) {
                temp = list[j] * list[i - j];
                if (max < temp) {
                    max = temp;
                }
            }
            list[i] = max;
        }
        return max;
    }
}
