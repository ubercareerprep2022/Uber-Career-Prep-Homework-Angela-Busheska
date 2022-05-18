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
 
 void deleteNode(int index)
    {
        // If our linked list is empty, we immediately delete the last part
        if (head == null)
            return;
 
        // Store the head node
        Node a = head;
 
        // If we need to remove the head of the linked list
        if (index == 0) {
            head = a.next; // We are switching the head with the new head
            return;
        }
        
        //If we don't have to remove the last mode, but some other further
        //down the line,we create a loop, going backward
        
        // Find previous node of the node to be deleted
        for (int i = 0; a != null && i < position - 1;
             i++)
            a = a.next;
 
        // If position is more than number of nodes
        if (a == null || a.next == null)
            return;
 
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;
 
        temp.next
            = next; // Unlink the deleted node from list
    }
 
	 
