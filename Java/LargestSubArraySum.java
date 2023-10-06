import java.util.Scanner;
public class LargestSubArraySum {
    public static int maxSubarraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subarrays to consider: ");
        int numSubarrays = scanner.nextInt();

        System.out.print("Enter the array elements separated by spaces: ");
        int[] nums = new int[numSubarrays];
        for (int i = 0; i < numSubarrays; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = maxSubarraySum(nums);
        System.out.println("Largest sum of contiguous subarray: " + result);

        scanner.close();
    }
}
