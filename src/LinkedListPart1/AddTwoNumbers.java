package LinkedListPart1;

import java.util.Objects;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode1 = createListNode("999999");
        ListNode listNode2 = createListNode("999");
        ListNode listNodeSum  = addTwoNumbers(listNode1, listNode2);
        System.out.println("Printing List Node1");
        ListNode.printListNode(listNode1);
        System.out.println("Printing Middle List Node2");
        ListNode.printListNode(listNode2);
        System.out.println("Printing Middle List Node Sum");
        ListNode.printListNode(listNodeSum);

        listNode1 = createListNode("56");
        listNode2 = createListNode("549");
        listNodeSum  = addTwoNumbers(listNode1, listNode2);
        System.out.println("Printing List Node1");
        ListNode.printListNode(listNode1);
        System.out.println("Printing Middle List Node2");
        ListNode.printListNode(listNode2);
        System.out.println("Printing Middle List Node Sum");
        ListNode.printListNode(listNodeSum);
    }
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num = sumListNode(l1, l2);
        return createListNode(num);
    }

    static String sumListNode(ListNode l1, ListNode l2){
        StringBuilder out = new StringBuilder();
        int carry = 0;
        while(Objects.nonNull(l1) || Objects.nonNull(l2) || carry>0){
            int val1 = getValue(l1);
            int val2 = getValue(l2);
            l1 = getNextNode(l1);
            l2 = getNextNode(l2);
            int sum = val1 + val2 + carry;
            if(sum>=10){
                carry = 1;
            } else{
                carry = 0;
            }
            sum = sum%10;
            out.append(sum);
        }
        return out.toString();
    }

    static ListNode createListNode(String num){
        if(Objects.equals(num, "0")){
            return new ListNode(0, null);
        }
        ListNode node = null;
        int n = num.length();
        for(int i=n-1;i>=0;i--){
            char ch = num.charAt(i);
            int val = ch-48;
            node = new ListNode(val, node);
        }
        return node;
    }

    static int getValue(ListNode node){
        if(Objects.nonNull(node)){
            return node.val;
        }
        return 0;
    }

    static ListNode getNextNode(ListNode node){
        if(Objects.nonNull(node) && Objects.nonNull(node.next)){
            return node.next;
        }
        return null;
    }
}
