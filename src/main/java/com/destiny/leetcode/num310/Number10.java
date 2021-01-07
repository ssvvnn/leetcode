package com.destiny.leetcode.num310;

/**
 * @author zhuhaifeng
 * @since 2020-07-12
 * 斐波那契数列
 */
public class Number10 {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        if (n == 0) {
            return f0;
        }
        if (n == 1) {
            return f1;
        }
        for (int i = 2; i <= n; i++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }
    //递归实现
    public static int fibonacci1(int n) {
        int f0 = 0;
        int f1 = 1;
        if (n == 0) {
            return f0;
        }
        if (n == 1) {
            return f1;
        }
        return fibonacci1(n - 1) + fibonacci1(n-2);
    }
}
