public Node findMiddle(Node head){
        Node  hare =  head ;
        Node turtle = head ;
        while(hare.next != null || hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle ;
    }
