//pairsThatEqualSum(inputArray: [1, 2, 3, 4, 5], targetSum: 5) == [(1, 4), (2, 3)]

public List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) 
//A standard bruteforce solution to check for every single pair if they give the specified result: this solution, 
//while obtainable, has to go through the array two times, which will bring a complexity of O(n^2)

//Another possible solution would be to sort the array, and make combinations between the small values and the big values.
  //e.g. 1,2,3,4,5, (1+5, 2+4, etc.)
  
//Probably, given the nature of the problem, we can possibly utilize the hashmaps.
//Since the first one takes more time and space, let's proceed with the second one.

{
  int min = 0; //we enter the first possible number
  int max = inputArray.length - 1; // we enter the last possible number
  
  while (min < max) //we go through the array
  {
    if (inputArray[min] + inputArray[max] == targetSum) //we check if any of the given combination gives back the result we want 
    {
      return inputArray[min], inputArray[max] //we get back the numbers: both sums[min] and sums[max]
    }
    //since we want to continue searching on (if our solutions fails in the first step)
    if (inputArray[min] + inputArray[max] < target Sum {
      min ++; // if the value is smaller than our target Sum, then we increase on the minimum side to reach equilibrium point
    }
      else {
       high --; //if it is greater than the target sum we shall plan on lowering down the given values.
      }
    }
 }
  
        
