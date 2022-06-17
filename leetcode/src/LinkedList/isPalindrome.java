package LinkedList;

public class isPalindrome {
        public boolean isPalindrome(ListNode head) {
            if(head == null || head.next == null){
                return true;
            }

            ListNode middle = findMiddle(head);//end of first half;
            ListNode secondHalfStart = reverse(middle.next);

            ListNode firstHalfStart = head;
            while(secondHalfStart != null){
                if(firstHalfStart.val != secondHalfStart.val){
                    return false;
                }
                firstHalfStart = firstHalfStart.next;
                secondHalfStart = secondHalfStart.next;

            }
            return true;
        }

        public ListNode reverse(ListNode head){
            ListNode prev = null;
            ListNode curr = head;

            while(curr != null){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
        public ListNode findMiddle(ListNode head){
            ListNode hare = head;
            ListNode turtle = head;

            while(hare.next!= null && hare.next.next != null){
                hare = hare.next.next;
                turtle = turtle.next;
            }
            return turtle;
        }

    private class ListNode {
        public ListNode next;
        public char val;
    }
}

