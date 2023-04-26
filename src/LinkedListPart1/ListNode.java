package LinkedListPart1;

import java.util.Objects;

public class ListNode{
    int val;
    ListNode next;

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public static void printListNode(ListNode head){
        while(Objects.nonNull(head)){
            System.out.print(head);
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode createListNode(int n){
        ListNode listNode = null;
        for(int i=n;i>=1;i--){
            listNode = new ListNode(i, listNode);
        }
        return listNode;
    }

    @Override
    public String toString(){
        return String.valueOf(val);
    }
}