package com.destiny.leetcode.num310;

import java.util.Stack;

/**
 * @author zhuhaifeng
 * @since 2020-07-12
 * 两个栈实现一个队列
 */
public class Number9 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.appendTail(1);
        queue.appendTail(2);
        queue.deleteHead();
        queue.deleteHead();
    }
    static class Queue {
        Stack<Object> stack1;
        Stack<Object> stack2;
        public Queue() {
             stack1 = new Stack<>();
             stack2 = new Stack<>();
        }
        public void appendTail(Object o) {
            stack1.push(o);
        }
        public Object deleteHead() {
            //需要把stack2的内容弹空,才加进去
            if (stack2.isEmpty()) {
                while (stack1.size() != 0) {
                    stack2.push(stack1.pop());
                }
            }
            if (stack2.isEmpty()) {
                return null;
            }
            return stack2.pop();
        }
    }
}
