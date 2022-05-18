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
 
static insert (Node node, int index) {
        Node node = headNode;
       //If the index is smaller than 1: it has an invalid position
	if (index < 1)
            System.out.print("Invalid position");
 
        // Now when the position is 1, the new node is set in front of head node
        if (index == 1) {
            Node newNode = new Node;
            newNode.nextNode = headNode;
            head = newNode;
        } else {
		//if it is a greater than 1, then we go through the array
            while (index-- != 0) {
                if (index == 1) {
                    // adding node at 
                    Node newNode = GetNode; //Can we use GetNode here?//
 
                    // make the new Node to point to the old Node at the same position
                    newNode.nextNode = headNode.nextNode;
 
                    //Replacing the current Node with the new Node
                    headNode.nextNode = newNode;
                    break;
                }
                headNode = headNode.nextNode;
            }
            if (position != 1)
                System.out.print("Position out of range");
        }
        return head;
    }
 
