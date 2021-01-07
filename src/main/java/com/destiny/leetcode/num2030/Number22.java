package com.destiny.leetcode.num2030;

import com.destiny.leetcode.Node;

/**
 * @author zhuhaifeng
 * @since 2020-08-25
 * 反转链表
 */
public class Number22 {
    public static void main(String[] args) {
        Node five = new Node(5, null);
        Node four = new Node(4, five);
        Node third = new Node(3, four);
        Node two = new Node(2, third);
        Node head = new Node(1, two);
    }
    public static Node reverseList(Node head) {
        Node pre = null;
        Node node = head;
        Node next = null;
        Node newHead = head;
       while (node != null) {

       }
    }
}
