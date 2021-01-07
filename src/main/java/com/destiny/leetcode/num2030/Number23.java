package com.destiny.leetcode.num2030;

import com.destiny.leetcode.Node;

/**
 * @author zhuhaifeng
 * @since 2020-08-24
 * 链表的倒数k个节点
 */
public class Number23 {
    public static void main(String[] args) {
        Node five = new Node(5, null);
        Node four = new Node(4, five);
        Node third = new Node(3, four);
        Node two = new Node(2, third);
        Node head = new Node(1, two);
        Node node = lastNode(head, 2);
        System.out.println(node.toString());
        Node node1 = lastNode(head, 3);
        System.out.println(node1.toString());
    }
    public static Node lastNode(Node head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.getNext();
        }
        while (fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return slow;
    }
}
