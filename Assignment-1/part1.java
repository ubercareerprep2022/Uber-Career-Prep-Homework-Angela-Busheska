//isStringPermutation() that takes two Strings as parameters and returns a Boolean denoting whether the first string is a permutation of the second string.

//isStringPermutation(s1: “asdf”, s2: “fsda”) == true
//isStringPermutation(s1: “asdf”, s2: “fsa”) == false
//isStringPermutation(s1: “asdf”, s2: “fsax”) == false

//Discussion(self-clarifying questions):
// 1) Are the strings made up of only letters (or can they involve characters as well)? This will help me understand if the array of elements shall consist of only 26 elements or more?
//As given by the examples, I will assume we only use the alphabet letters.

//2) Since it is permutation the order of the elements matters, but that has nothing to do with our case, since anyway we use to check if they have the same elements.


public boolean isStringPermutation(String s1, String s2) 

{
    //The first preliminary cause for s1 to be a permutation of s2 is for both of them to have the same length; if they are not of the same length, then we return false!
    if (s1.length() != s2.length())
    {
        return false;
    }
    
    
    //At this point I came across the following solutions:
    //1) Go through the array and re-check for each character if it is present in the array - tedious process
    //2) Another BruteForce approach: Reiterate over the array, and each time we see a different character,    we mark the amount of distinct apperances. 
    // angela (two a's)
    // then we go through the permutation ngelaa (two a's); in this way we can store the number of appearances for both of them, and then compare if they are the same;
    //3) We can sort the arrays and check if both contain the same elements.
    //4) Possibly, we can use a hashmap to order the arrays.
    
    int [] characters = new characters [26]; //initializing the array - assuming only the alphabet will be there;
    
    for (int i = 0; i < s1.length, i++) 
    {
        characters[s1.charAt(i)-'a']++; //get the codes of the characters from s1, we use a to make sure the index is uniform 
        //Even better approach than the previously mentioned one is to reduce the appearances of b
        characters[s2.charAt(i)-'a']--; // we reduce the codes of the characters from s2
        //I expect this to outline the following:
        // for acn and nca -> a(1), c(2), n(3)
        // 1: for acn we have 1,2,3
        // 2: for nca we have 3, 2, 1
        
        //the result at the end in the array is equal to 0
        
        //now we go to check through every integer in the array; if they are not equal to zero, that means there was no permutation
        for (integer: characters) {
            if (integer != 0) 
            {
                return false;
            }
            return true;
        }
    }
    
}
