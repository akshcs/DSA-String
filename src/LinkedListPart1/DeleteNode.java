package LinkedListPart1;

import java.util.Objects;

public class DeleteNode {
    public static void main(String[] args) {
        ListNode listNode = ListNode.createListNode(5);
        System.out.println("Printing List Node");
        ListNode.printListNode(listNode);
        System.out.println("Printing Middle List Node");
        ListNode midNode = MiddleNode.middleNode(listNode);
        ListNode.printListNode(midNode);
        deleteNode(midNode);
        System.out.println("Printing After deleting MidList Node");
        ListNode.printListNode(listNode);


        listNode = ListNode.createListNode(6);
        System.out.println("Printing List Node");
        ListNode.printListNode(listNode);
        System.out.println("Printing Middle List Node");
        midNode = MiddleNode.middleNode(listNode);
        ListNode.printListNode(midNode);
        deleteNode(midNode);
        System.out.println("Printing After deleting MidList Node");
        ListNode.printListNode(listNode);
    }
    static void deleteNode(ListNode node) {
        ListNode Next = node.next;
        node.val = Next.val;
        if(Objects.nonNull(Next.next)){
            node.next = Next.next;
        } else {
            node.next = null;
        }

    }
}
