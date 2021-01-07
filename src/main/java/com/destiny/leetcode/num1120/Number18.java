package com.destiny.leetcode.num1120;

import com.destiny.leetcode.Node;

/**
 * @author zhuhaifeng
 * @since 2020-08-19
 * O(1)删除链表节点
 */
public class Number18 {
    public static void main(String[] args) {
        Node three = new Node(4, null);
        Node two = new Node(3, three);
        Node one = new Node(2, two);
        Node head = new Node(1, one);
        deleteSpecialNode(head, head);
        System.out.println(head.toString());
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
    }

    public static void deleteSpecialNode(Node head, Node specialNode) {
        if (head == null || specialNode == null){
            return;
        }
        if (specialNode.getNext() != null) {
            Node next = specialNode.getNext();
            Node nextNext = next.getNext();
            specialNode.setValue(next.getValue());
            specialNode.setNext(nextNext);
            next.setNext(null);
        } else {
            Node pre = head;
            while (pre.getNext() != specialNode) {
                pre = pre.getNext();
            }
            pre.setNext(null);
        }
    }
}
