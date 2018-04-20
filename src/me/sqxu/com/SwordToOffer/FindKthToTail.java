/*
 * Copyright (C), 2015-2017
 * FileName: FindKthToTail
 * Author:   Administrator
 * Date:     2017/12/14 0014 21:03
 * Description: 输入一个链表，输出该链表中倒数第k个结点。    
 */

package me.sqxu.com.SwordToOffer;

/**
 * 〈一句话功能简述〉<br>
 * 〈输入一个链表，输出该链表中倒数第k个结点。〉
 *
 * @author Administrator
 * @subject 输入一个链表，输出该链表中倒数第k个结点。
 * @Strategies
 *      两个指针，先让第一个指针和第二个指针都指向头结点，
 *      然后再让第一个指正走(k-1)步，到达第k个节点。然后两个指针同时往后移动，
 *      当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了
 * @create 2018/4/5 0014
 * @since 1.0.0
 */

/*public static class ListNode{
    int val ;
    ListNode next = null;
    ListNode (int val){
        this.val = val;
    }
    ListNode append(ListNode node){
        this.next = node;
        return this;
    }



}*/

public class FindKthToTail {
    //类中类，构造ListNode类及方法
    public static class ListNode{
        int val;
        ListNode next = null;
        public ListNode(int val){
            this.val = val;
        }

    }



    public static ListNode find(ListNode head, int k) {
        if(head == null|| k <=0){
            return null;
        }

        ListNode pre = head;//创建两个头节点
        ListNode last = head;

        for(int i = 1;i < k;i++){
            if(pre.next != null) {
                pre = pre.next;//pre先走k-1步
            }else {
                return null;
            }
        }

        while(pre.next != null){
            //在pre先走k-1步的基础上 ，pre,last一起走
            // （pre已走k-1步，还剩n-k+1步，就是last要走的步数）
            pre = pre.next;
            last = last.next;
        }
        return last;
    }

    //主函数
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(find(node1,2).val);
    }
}
