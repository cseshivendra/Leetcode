import java.util.Arrays; // Importing Arrays for printing the array

class RemoveDuplicates {
    // Method to remove duplicates from a sorted array
    public static int remDuplicates(int[] nums) {
        // If the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        int res = 1; // Initialize the count of unique elements

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the last unique element
            if (nums[i] != nums[res - 1]) {
                nums[res] = nums[i]; // Update the next position with the new unique element
                res++; // Increment the count of unique elements
            }
        }

        return res; // Return the count of unique elements
    }

    public static void main(String[] args) {
        // Example array with duplicates
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        // Call the method to remove duplicates and get the new length
        int newLength = RemoveDuplicates.remDuplicates(nums);

        // Print the number of unique elements
        System.out.println("Number of unique elements: " + newLength);
        System.out.print("Unique elements: ");

        // Print the unique elements in the modified array
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        // Optional: Print the original array for reference
        System.out.println("\nOriginal array: " + Arrays.toString(nums));
    }
}