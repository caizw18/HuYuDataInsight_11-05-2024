// Given an array arr[] of n integers and a target value, 
// the task is to find whether there is a pair of elements in the array whose sum is equal to target.



// public class Order9 {
    
//     static boolean twoSum(int[] arr, int target)
//     {
//         int n = arr.length;

//         for(int i = 0; i < n; i++){

//             for(int j = i + 1; j < n; j++){
                
//                 if(arr[i] + arr[j] == target){
//                     return true;
//                 }
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {
        
//         int[] arr = {0, -1, 2, -3, 1};
//         int target = -2;

//         if(twoSum(arr, target))
//             System.out.println("true");
//         else
//             System.out.println("false");
//     }
// }

import java.util.Arrays;


public class Order9 {
    
    static boolean twoSum(int[] arr, int target)
    {
       Arrays.sort(arr);

       int left = 0, right = arr.length - 1;

       while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target)
                return true;
            else if (sum < target)
                left++;
            else
                right--;
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