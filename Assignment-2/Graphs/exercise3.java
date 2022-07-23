public List<Integer> depthFirtst(int key){
 
 List<Boolean, Integer> visited = new HashMap<>();
 List<Integer> queue = new LinkedList<>();
 List<Integer> levels = new LinkedList<>();
 
 queue.addFirst(key);
 while (queue.size() != 0) {
  
   int node = queue.removeFirst();
   queue.addFirst(node);
   visited.put(node.true);
  
   for (int i = 0; i<queue.size(); i++) {
    if (visited.get(node) != null) {
     levels.addFirst(node.val);
    }
    
   }
 }
 return levels;
}
