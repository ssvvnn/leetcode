package com.destiny.leetcode.num2030;

import com.destiny.leetcode.Node;

import java.util.LinkedList;

/**
 * @author zhuhaifeng
 * @since 2020-08-19
 * 合并两个有序的链表
 */
public class Number25 {
    public static void main(String[] args) {
        Node n1 = new Node(1, new Node(3, null));
        Node n2 = new Node(2, new Node(4, null));
        Node node = mergeLinklist(n1, n2);

    }
    public static Node mergeLinklist(Node n1, Node n2) {
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }
        Node merge;
        if (n1.getValue() < n2.getValue()) {
            merge = n1;
            merge.setNext(mergeLinklist(n1.getNext(), n2));
        } else {
            merge = n2;
            merge.setNext(mergeLinklist(n2.getNext(), n1));
        }
        return merge;
    }
}
