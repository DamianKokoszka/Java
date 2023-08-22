package com.javafee.java.tasks;


class Main {

    int val;
    ListNode prev;
    ListNode next;

    class ListNode {
        int val;
        ListNode prev;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        void addBefore(ListNode node, int index, int val) {
            ListNode newNode = new ListNode(val);
            ListNode curr = node;

            for (int i = 0; i < index && curr != null; i++) {
                curr = curr.next;
            }
            if (curr == null) {
                return;
            }

            ListNode prev = curr.prev;
            newNode.prev = prev;
            newNode.next = curr;
            prev.next = newNode;
            curr.prev = newNode;
        }
    }
}
