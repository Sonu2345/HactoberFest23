import java.util.Scanner;

public class Array_PrefixSum {

    // Method to calculate the maximum subarray sum
    public static void maxSubArraySum(int num[]) {
        // Initialize current sum and maximum sum
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Create a prefix array of the same length as the input array
        int prefix[] = new int[num.length];

        // The first element of the prefix array is the first element of the input array
        prefix[0] = num[0];

        // Calculate the prefix array
        for(int i = 1; i < prefix.length; i++) {
            // Each element in the prefix array is the sum of all previous elements in the input array
            prefix[i] = prefix[i-1] + num[i];
        }

        // Iterate over the input array
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;

                // Calculate the current sum using the prefix array
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                // If the current sum is greater than the maximum sum, update the maximum sum
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        // Print the maximum subarray sum
        System.out.println("Max sum is: " + maxSum);
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Create an array of the given size
        int num[] = new int[size];

        // Ask the user for the elements of the array
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            num[i] = scanner.nextInt();
        }

        // Call maxSubArraySun with the user input array
        maxSubArraySum(num);
    }
}
