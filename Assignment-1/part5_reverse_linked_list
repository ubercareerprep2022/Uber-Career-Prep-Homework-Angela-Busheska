//Reverse list Function - Iteratively
Node reverseList(Node head) {
        ListNode prev = null;
        //If we have a LinkedList greater than 1, we have the following:
        while (head != null) {
        	//we appoint next node (So we make sure we have place to store all our information)
            Node next = head.next;
            //Then we choose the previous mode
            head.next = prev;
            //Since it is a reverse list, now the previous becomes the head
            prev = head;
            //And again we are choosing next to have a place to store our values
            head = next;
        }
        return prev;
    }
