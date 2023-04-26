package LinkedListPart1;

import java.util.Objects;

public class MiddleNode {

    public static void main(String[] args) {
        ListNode listNode = ListNode.createListNode(5);
        System.out.println("Printing List Node");
        ListNode.printListNode(listNode);
        System.out.println("Printing Middle List Node");
        ListNode.printListNode(middleNode(listNode));

        listNode = ListNode.createListNode(6);
        System.out.println("Printing List Node");
        ListNode.printListNode(listNode);
        System.out.println("Printing Middle List Node");
        ListNode.printListNode(middleNode(listNode));
    }
    static ListNode middleNode(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = null;
        if(Objects.nonNull(ptr1) && Objects.nonNull(ptr1.next)){
            ptr2 = ptr1.next;
        }
        while(Objects.nonNull(ptr2)){
            ptr1 = getNextOrNull(ptr1);
            ptr2 = getNextOrNull(ptr2);
            ptr2 = getNextOrNull(ptr2);
        }
        return ptr1;
    }

    static ListNode getNextOrNull(ListNode ptr){
        if(Objects.nonNull(ptr) && Objects.nonNull(ptr.next)){
            return ptr.next;
        }
        return null;
    }
}
