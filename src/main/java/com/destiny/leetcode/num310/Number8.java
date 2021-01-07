package com.destiny.leetcode.num310;

/**
 * @author zhuhaifeng
 * @since 2020-07-12
 * 中序遍历的下一个节点
 */
public class Number8 {
    public static void main(String[] args) {

    }
    static class Node {
        private int val;
        private Node left;
        private Node right;
        private Node parent;
        public Node(int val){
            this.val = val;
        }
    }

    /**
     * 三种
     * @param node
     * @return
     */
    public Node getNext(Node node) {
        if (node == null) {
            return null;
        }
        Node nextNode = null;
        if (node.right != null) {
            Node nextRight = node.right;
            while (nextRight.left != null) {
                nextRight = nextRight.left;
            }
            nextNode = nextRight;
        } else if (node.parent != null) {
            Node current = node;
            Node parent = node.parent;
            while (parent != null && parent.right != current) {
                current = parent;
                parent = parent.parent;
            }
            nextNode = parent;
        }
        return nextNode;
    }
}
