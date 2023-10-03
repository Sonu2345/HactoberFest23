class Solution {
    // Define a public method isMonotonic that takes an integer array 'nums' as input
    public boolean isMonotonic(int[] nums) {
        // Initialize two boolean variables 'inc' and 'dec' as true to assume both increasing and decreasing sequences
        boolean inc = true;
        boolean dec = true;
        
        // Iterate through the 'nums' array from the beginning to the second-to-last element
        for(int i = 0; i < nums.length - 1; i++){
            // Check if the current element is greater than the next element
            if(nums[i] > nums[i+1]){
                // If true, set 'dec' to false, indicating it's not a decreasing sequence
                dec = false;
                // Exit the loop, as we've found evidence against a decreasing sequence
                break;
            }
        }

        // Iterate through the 'nums' array again
        for(int i = 0; i < nums.length - 1; i++){
            // Check if the current element is less than the next element
            if(nums[i] < nums[i+1]){
                // If true, set 'inc' to false, indicating it's not an increasing sequence
                inc = false;
                // Exit the loop, as we've found evidence against an increasing sequence
                break;
            }
        }

        // Return true if either 'inc' or 'dec' is true, meaning the sequence is either increasing or decreasing or both
        return inc || dec;
    }
}
