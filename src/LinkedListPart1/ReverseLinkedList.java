package LinkedListPart1;

import java.util.Objects;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode listNode = ListNode.createListNode(5);
        ListNode.printListNode(listNode);
        System.out.println("Printing Reverse List Node");
        ListNode.printListNode(reverseList(listNode));
    }
    static ListNode reverseList(ListNode head) {
        ListNode prev = null, Next = null;
        ListNode curr = head;
        if(Objects.nonNull(curr) && Objects.nonNull(curr.next)){
            Next = curr.next;
        }
        while(Objects.nonNull(curr)){
            curr.next = prev;
            prev = curr;
            curr = Next;
            if(Objects.nonNull(curr) && Objects.nonNull(curr.next)){
                Next = curr.next;
            } else{
                Next = null;
            }
        }
        return prev;
    }
}
