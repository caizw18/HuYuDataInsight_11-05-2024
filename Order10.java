// Hashing provides a more efficient solution to the 2Sum problem. 
// Rather than checking every possible pair, we store each number in an unordered set
// during iterating over the array’s elements.
// For each number, we calculate its complement (i.e., target minus current number) and check
//if this complement exists in the set.
// If it does, we have successfully found the pair that sums to the target.
// This approach significantly reduces the time complexity and allowing us to solve the problem in linear time O(n).


// Step-by-step approach:

// Create an empty Hash Set or Unordered Set
// Iterate through the array and for each number in the array:
// Calculate the complement (target minus current number).
// Check if the complement exists in the set:
// If it is, then pair found.
// If it isn’t, add the current number to the set.
// If the loop completes without finding a pair, return that no pair exists.
// Below is the code snippet to implement the above approach:

import java.util.HashSet;

public class Order10 {
    
    static boolean twoSum(int[] arr, int target)
    {
        // Create a HashSet to store the elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate through each element in the array
        for(int i = 0; i < arr.length; i++){
            // Calculate the complement that added to
            // arr[i], equals the target
            int complement = target - arr[i];

            if(set.contains(complement)){
                return true;
            }

            set.add(arr[i]);

        }

        return false;
    }

    public static void main(String[] args) {
        
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;

        if(twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}