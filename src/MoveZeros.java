import java.util.Arrays;

public class MoveZeros {
    // Method to move all zeros to the end of the array
    void pushZerosToEnd(int[] arr) {
        int count = 0; // Count of non-zero elements

        // Traverse the array. If the current element is non-zero, place it at the 'count' index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] with arr[count]
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] arr1 = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        System.out.println("Original array: " + Arrays.toString(arr1));
        solution.pushZerosToEnd(arr1);
        System.out.println("Array after pushing zeros to the end: " + Arrays.toString(arr1));
    }
}
