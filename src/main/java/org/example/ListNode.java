package org.example;

public class ListNode {
    private ListNode next;

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while(curr != null)
        {
            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
}


//Algorithm
//Function ReverseList(head)
//    Initialize prev to NULL
//    Initialize curr to head
//
//    While curr is not NULL
//        // Save the next node
//        next = curr.next
//
//        // Reverse the link
//        curr.next = prev
//
//        // Move prev and curr forward
//        prev = curr
//        curr = next
//
//    // Return the new head of the reversed list
//    Return prev
//End Function
