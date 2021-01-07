package com.destiny.leetcode.num310;

import java.util.Stack;

/**
 * @author zhuhaifeng
 * @since 2020-06-16
 */
public class Number6 {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node one = new Node(3);
        Node two = new Node(2);
        head.next = one;
        one.next = two;
        reverse(head);
    }

    public static void  reverseLinklist(Node head) {
        Stack<Node> nodes = new Stack<>();
        while (head.next != null){
            nodes.push(head);
            head = head.next;
        }
        for (Node node : nodes){
            System.out.println(nodes.pop().val);
        }
    }

    /**
     * 递归实现
     * @param head
     */
    public static void reverse(Node head) {
        if (head == null) {
            return;
        }
        reverse(head.next);
        System.out.println(head.val);
    }
    static class Node {
       private int val;
       private Node next;
       public Node(int val){
           this.val = val;
       }
    }
}
