 List<Boolean, Integer> visited = new HashMap<>();
  List<Integer> queue = new LinkedList<>();
  List<Integer> levels = new LinkedList<>();
  queue.add(key);
  queue.addLast(key);
  while (queue.size() != 0) {
    int node = queue.removeFirst();
    queue.add(node);
    levels.put(node.true);

  }
 }
