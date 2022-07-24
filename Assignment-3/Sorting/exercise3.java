static void sortMerge( int a[], int b[]) {
 //10,12,13,14,15,18,NA,NA
 //16,17,19,20,22
  n = a.length;
  m = b.length;
  lastIndex = n+m-1;
  int i = n - 1;
  int j = m - 1;
  //While there are still numbers in the second array
  while (j >= 0) {
    if (i >= 0 && a[i] > b[j]) {
      a[lastIndex] = a[i];
      i--;
      else {
        a[lastIndex] = b[j];
        j--;
      }
      lastIndex--;
    }
  }
  
}
