package com.destiny.leetcode.num2030;

import com.destiny.leetcode.Node;

/**
 * @author zhuhaifeng
 * @since 2020-08-23
 * 环的入口
 */
public class Number24 {
    public static void main(String[] args) {
        Node five = new Node(5, null);
        Node four = new Node(4, five);
        Node third = new Node(3, four);
        Node two = new Node(2, third);
        Node head = new Node(1, two);
        five.setNext(two);
        Node entrance = entranceNode(two);
        System.out.println(entrance.toString());
    }

    public static Node entrance(Node node) {
        if (node == null) {
            return null;
        }
        Node slow = node;
        Node fast = node;
        while (slow != null && fast != null) {
            slow = slow.getNext();
            fast = fast.getNext();
            if (fast != null) {
                fast = fast.getNext();
            }
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public static Node entranceNode(Node head) {
        Node entrance = entrance(head);
        int nodeNum = 1;
        if (entrance == null) {
            return null;
        }
        Node temp = entrance;
        while (entrance.getNext() != temp) {
            entrance = entrance.getNext();
            nodeNum++;
        }
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < nodeNum; i++) {
            p2 = p2.getNext();
        }
        while (p1 != p2) {
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        return p1;
    }
}
