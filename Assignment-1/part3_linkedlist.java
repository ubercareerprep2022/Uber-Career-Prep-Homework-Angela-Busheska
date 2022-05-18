	/* Appends a new node at the end. */
	void push(Node node)
	{
		//If the head of the last node is empty
		if (head == null)
		{
			//in that situation we will have another node at the end
			head = node;
			node.next = null; //The next node will be empty
			return;
		}
		else {

		//We pass through the nodes, checking for every single node
		Node last = head;
		while (last.next != null)
			last = last.next;

		//assigning a mode on the last one
		last.next = node;
		return;
		}
	}
	

    // Function to remove the last node //
    static Node removeLastNode(Node head)
    {
    	//Start from the head node, if it is not empty, it should be empty
        if (head == null)
            return null;
        
        if (head.next == null) {
            return null;
        }
 
        //Now that we made for the last node to be null
        //we position the secondLastNode as the head
        Node secondLastNode = head;
        //Now we go through the array
        while (secondlastNode.next != null)
            secondLast = secondLast.next;
 
        // Change next of second last
        secondLast.next = null;
 
        return head;
    }
 
