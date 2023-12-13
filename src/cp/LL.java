package cp;

import java.util.LinkedList;

public class LL {

    ListNode head;
    ListNode tail;
    int size = 0;

/*
    public LL() {

    }*/

    public static void main(String[] args) {
     LL ll = new LL();

     ListNode head = new ListNode(23);
     ll.insertFirstNode(head);

        System.out.println(ll.head.val);

    }

    public void insertFirstNode(ListNode head){
        this.head = head;
    }


    public static ListNode middleNode(ListNode head) {

        return head;

    }
}



