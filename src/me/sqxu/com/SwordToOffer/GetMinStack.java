/*
 * Copyright (C), 2015-2017
 * FileName: GetMinStack
 * Author:   Administrator
 * Date:     2017/11/16 0016 16:38
 * Description: 剑指offer---在栈中得到最小的元素    
 */

package me.sqxu.com.SwordToOffer;


import java.util.Stack;
//import java.util.Iterator;
/**
 * 〈一句话功能简述〉<br>
 * 〈剑指offer---在栈中得到最小的元素〉
 *
 * @author xsq
 * 2018 -4- 13
 * @subject 1. 设计一个特殊的栈，在实现栈的基本功能上，再实现返回栈的最小值的功能
         * 2. pop, push, getMIn操作时间复杂度为O（1）
 *         3. 时间限制：1秒 空间限制：32768K
 * @Strategies 设计上使用两个栈，一个用来保存当前栈中的元素--StackData；另一个栈用于保存每一步之中的最小值--记为StackMin
 */



public class GetMinStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    //应用一个 辅助栈，入栈时，若栈A压入的元素大于B栈的顶元素的值，那么只压入A栈
    //否则AB同时压入。。。出栈，如果AB栈顶元素不等，则A出B不出
    public void push(int node) {
        stack1.push(node);
        if(stack2.empty()){
            stack2.push(node);      //若stack2空，则压入元素
        }else if(node <= stack2.peek()){
            stack2.push(node);       //若stack2顶元素大于要压入的元素值，则压入
        }else
            stack2.push(stack2.peek());

    }

    public void pop() {
        if(stack1.peek() == stack2.peek())
            stack1.pop();        //出栈，如果AB栈顶元素不等，则A出B不出
        stack2.pop();
    }

    public  int top() {
        return  stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }


    public static void main(String[] args) {
        GetMinStack ps = new GetMinStack();
        ps.push(34);
        ps.push(12);
        ps.push(90);
        ps.push(4);
        System.out.println(ps.min());
    }
}
