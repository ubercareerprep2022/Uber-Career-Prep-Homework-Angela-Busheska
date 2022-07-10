 List<Boolean, Integer> visited = new HashMap<>();
  List<Integer> queue = new LinkedList<>();
  List<Integer> levels = new LinkedList<>();
  queue.addLast(key);
  while (queue.size() != 0) {
    int node = queue.removeFirst();
    queue.add(node);
    levels.put(node.true);
  for (int i; i<queue.size; i++){
    while (levels.get(node) != null){
      queue.addFirst(node)
    }
   }
  }
  return levels;
 }
