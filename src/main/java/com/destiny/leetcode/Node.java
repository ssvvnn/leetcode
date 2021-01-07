package com.destiny.leetcode;

/**
 * @author zhuhaifeng
 * @since 2020-08-19
 * 链表节点
 */
public class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
    public Node getNext() {
        return next;
    }
    public int getValue() {
        return value;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString(){
        return value + "->" + (next != null ? next.value : "null");
    }
}
