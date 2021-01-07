package com.destiny.leetcode.num310;

import java.util.Arrays;

/**
 * @author zhuhaifeng
 * @since 2020-06-15
 */
public class Num3 {
    public static void main(String[] args) {
        int[] list = new int[]{2,3,1,0,2,5,3};
//        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        for (int i = 0;i<list.length;i++){
            while (list[i] != i){
             if (list[i] == list[list[i]]){
//                 return list[i];
             }
                swap(list, i, list[i]);
            }

        }
    }

    private static int[] swap(int[] list, int a, int b){
      int temp = list[a];
      list[a] = list[b];
      list[b] = temp;
      return list;
     }
}
