package com.core.java.print;

import java.util.Stack;

/**
 * 单栈排序
 *
 * @Author chenpantao
 * @Date 2020-05-29 12:28
 * @Version 1.0
 */
public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(6);
        stack.push(8);
        stack.push(7);
        stack.push(3);
        stack.push(9);
        sortDesc(stack);
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            Integer pop = stack.pop();
            if (i == 4) {
                System.out.println(pop);
            }
        }
    }

    public static Stack<Integer> sortDesc(Stack<Integer> stack) {

        int up = stack.pop();
        int now = up;

        do {
            if (stack.isEmpty()) {           // 到达栈底部 , 直接弹出
                stack.push(up);
                return stack;
            }

            int down = stack.pop();         // 取出栈顶得两个元素 , 然后比较大小 , 保留大的 , 把小的压回去
            if (up < down) {
                int a = down;
                down = up;
                up = a;
            }
            stack.push(down);                // 保留了大得元素 , 剩下得接着比

            sortDesc(stack);
        } while (up < stack.peek());         //  当栈里面排序后 , 栈顶得元素如果比保留的元素大的话 , 就需要交换顶部两个元素

        stack.push(up);                      //  排序完成 , 将顶部元素压入栈中
        return stack;

    }

}
