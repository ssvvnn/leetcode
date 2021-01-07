package com.destiny.leetcode.num1120;

/**
 * @author zhuhaifeng
 * @since 2020-08-05
 * 二进制中1的个数
 */
public class Number15 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toBinaryString(-8));
        System.out.println(getNumber1(7));
        System.out.println(getNumber1(8));
        System.out.println(getNumber1(-8));
    }
    //用无符号右移，否则负数死循环
    public static int getNumber(int number) {
        int count = 0;
        while(number != 0) {
            count += number & 1;
            number >>>= 1;
        }
        return count;
    }
    //利用（n-1） & n,有多少个1就循环多少次
    public static int getNumber1(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = (number - 1) & number;
        }
        return count;
    }
}
