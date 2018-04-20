 /*
  * Copyright (C), 2015-2018
  * FileName: ReverseList
  * Author:   Administrator
  * Date:     2018/3/8 0008 22:29
  * Description: 反转链表
  */

 package me.sqxu.com.SwordToOffer;

 /**
  * 〈一句话功能简述〉<br>
  * 〈反转链表〉
  *
  * @author sxq
  * @create 2018/4/5 0008
  * @subject    1. 输入一个链表，反转链表后，输出链表的所有元素。
  *             2. 时间限制：1秒 空间限制：32768K
  * @Strategies
  * @since 1.0.0
  */
 public class ReverseList {

     private  static class ListNode{
         int val;
         ListNode next = null;
         ListNode(int val){
             this.val = val;
         }
     }

     /*反转链表用循环实现
     原理示例： head->1->2->3->4->5
               1<-pre  =current=  next->2->3->4->5
               current = head

               next = current.next 暂存下一个节点
               current.next = pre 当前节点下一个指向前一个

                pre = current       前一个节点值取代当前节点值，往下走
               current = next      让下一个节点值取代当前节点值，往下走
     */


     public  static ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode current = head;
        ListNode pre = null;
        ListNode next ;

        while(current != null){
            next = current.next;
            current.next = pre;

            pre = current;
            current = next;
        }

        return pre;
     }



     public static void main(String[] args) {
         ListNode node1 = new ListNode(2);
         ListNode node2 = new ListNode(3);
         ListNode node3 = new ListNode(4);
         ListNode node4 = new ListNode(5);

         node1.next = node2;
         node2.next = node3;
         node3.next = node4;
         System.out.println(ReverseList(node1).val);
     }
 }
