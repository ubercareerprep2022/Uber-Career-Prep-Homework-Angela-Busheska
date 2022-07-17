boolean isSubset (int arr1[], int arr2[], int m, int n) {
      HashSet<Integer> set = new <HashSet> ();
      for (int i = 0; i<m; i++) {
        if (!set.contains(arr1[i]))
          set.add(arr[i]); //If we don't have set1 in hashmap1, then we add it
      }
  
      for (int j = 0; j<n; j++) {
        if (!set.contains(arr[j]) {
          return false;
        }
         return true;
      }
}
