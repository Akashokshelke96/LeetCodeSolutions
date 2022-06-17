package LinkedList;

public class LinkedListCycle {
        public boolean hasCycle(ListNode head) {
            if(head == null){
                return false;
            }

            ListNode hare = head;
            ListNode turtle = head;
            while(hare != null && hare .next!= null){
                hare = hare.next.next;
                turtle = turtle.next;

                if(hare == turtle){
                    return true;
                }
            }
            return false;
        }
        //copy code till here
    //Please follow on Github if you find this helpful . Happy Coding!

    private class ListNode {
        public ListNode next;
    }
}
