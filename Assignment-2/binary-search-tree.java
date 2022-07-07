class BST {
    Node root;
    
    public void insert (int key) {
        if (root == null) {
            root = new Node();
            root.key = key;
        }
        Node temp = root;
        while (true) {
            if (temp.key >= key) {
                if (temp.left == null){
                    temp.left = new Node();
                    temp.left.key = key;
                    break;
                }
                else {
                    temp = temp.left;
                }
            }
            else {
                if (temp.right== null) {
                    temp.right = new Node ();
                    temp.right.key = key;
                    break;
                }
                else {
                    temp = temp.right;
                }
            }
        
        }
    }
        
    
}
