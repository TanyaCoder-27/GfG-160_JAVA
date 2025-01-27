/*
Second Largest
Difficulty: EasyAccuracy: 26.72%Submissions: 973K+Points: 2
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.
Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
*/

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        
        int n= arr.length;
        if(n==0 || n==1){
            return -1;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>first_max){
                second_max = first_max;
                first_max = arr[i];
            }
            else if(arr[i]>second_max && arr[i]<first_max){
                second_max = arr[i];
            }
        }
        if(second_max == Integer.MIN_VALUE){
            return -1; //nothing changed
        }
        return second_max;
    }
}
