//Adds the node at the end of the list
public void push(<Node> node)
{
  int data;
  Node node = new Node(data);
 
    //If the linked list is the last
    if (head == null)
    {
        head = new Node(data);
        return;
    }
   node.next = null;
 
  //If the Linked List is not the last
    Node node1 = head;
    while (node1.next != null)
        node1 = node1.next;

    node1.next = node;
    return;
}
