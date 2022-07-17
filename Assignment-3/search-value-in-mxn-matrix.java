class PairSum {
    static void searchValue(int arr[], int sum)
    {
      HashSet <Integer> s = new HashSet <Integer>();
      for (int i = 0; i<arr.length; i++) //Since we re-iterate across the array, we use its length!
      {
        int m = x - arr[i]; //M is the difference between the target sum and the specific i we are using;
        if(s.contains(m)) {
        return m, arr[i]
        }
          s.add(arr[i]);
      }
    }
}
