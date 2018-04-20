/*
 * Copyright (C), 2015-2017
 * FileName: PrintListFromTailToHead
 * Author:   Administrator
 * Date:     2017/11/16 0016 22:02
 * Description: 输入一个链表，从尾到头打印链表每个节点的值。    
 */

package me.sqxu.com.SwordToOffer;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br>
 * 〈输入一个链表，从尾到头打印链表每个节点的值。〉
 *@subject 输入一个链表，从尾到头打印链表每个节点的值
 * @Strategies
 *           思路：1. 可以借用栈的后进先出来实现 从尾到头的打印
 *           思路2： 使用递归来实现(递归方法和第一个栈方法写在一起，暂无法打印)
 * @author xsq
 * @create 2018/4/1 0016
 * @since 1.0.0
 */
public  class PrintListFromTailToHead {

    private static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    private static ArrayList<Integer> printList(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        while(listNode !=null){       //将链表中元素val压入栈
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<Integer>() ;
        while(!stack.empty()) {             //将栈中的元素取出到链表中
            list.add(stack.pop());
        }
        return  list;
    }

    /*private ArrayList<Integer> list = new ArrayList<>();
    private static ArrayList<Integer> printList2(ListNode listNode) {
        if (listNode != null) {
            this.printList2(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
*/
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(printList(node1));

        }
}


