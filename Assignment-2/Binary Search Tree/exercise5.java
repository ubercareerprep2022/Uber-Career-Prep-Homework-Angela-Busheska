   public int size(){
        return size;
   }  
  
  public void insert (String name, long number) {
        if (root == null) {
            root = new Node();
            root.name = name;
            root.number = number;
            size++;
            return;
        }
        Node temp = root;
        while (true) {
            if (current.name.compareTo(name)) {
                if (temp.left == null){
                    temp.left = new Node();
                    temp.left.name = name;
                    temp.left.number = number;
                    break;
                }
                else {
                    temp = temp.left;
                }
            }
            else {
                if (temp.right== null) {
                    temp.right = new Node ();
                    temp.right.name = name;
                    temp.right.number = number;
                    break;
                }
                else {
                    temp = temp.right;
                }
            }
        
        }
    }   

   public find(String name){
      Node temp = root;
      if (temp != null) {
         if (temp.name.equals(name)) {
            return temp.number;
         }
         else if (temp.name.compareTo(name) >0){
            temp = temp.left;
         }
         else {
            temp = temp.right;
         }
      }
      return - 1;
   }
