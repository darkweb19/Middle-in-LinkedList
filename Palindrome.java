public class Palindrome {
    public boolean isPalindrome(ListNode head){
         if(head == null || head.next == null){
            return true ;

         }
    }
    ListNode middle = findMiddle(head) ;
    ListNode secondHalfStart =reverse(middle.next);
    ListNode firstHalfStart = head ;
    while(secondHalfStart != null ) {
        if(firstHalfStart.val != secondHalfStart.val){
            return false;
        }
        
    }
}
