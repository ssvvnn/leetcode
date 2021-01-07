package com.destiny.leetcode.num2030;

import java.util.List;

/**
 * @author zhuhaifeng
 * @since 2020-08-20
 */
public class Test {

    public static void main(String[] args) {
        System.out.printf(merge(new Integer[]{1, 2}, new Integer[]{1, 4, 6, 7}).toString());
    }

    public static Integer[] merge(Integer[] list1, Integer[] list2) {
        Integer[] result = new Integer[list1.length + list2.length];
        int k = 0;int i = 0, j = 0;
        for (; i < list1.length && j < list2.length; ) {
            if (list1[i] < list2[j]) {
                result[k] = list1[i];
                i++;
                k++;
            } else {
                result[k] = list1[j];
                j++;
                k++;
            }
        }
        if (i == list1.length) {
            for (; j < list2.length; j++) {
                result[k] = list2[j];
                k++;
            }
        }
        if (j == list2.length) {
            for (; i < list1.length; i++) {
                result[k] = list1[i];
                k++;
            }
        }
        return result;

    }

}

