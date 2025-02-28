class MajorityElementsL {
    public int majorityElement(int[] nums) {
        int candidate = 0; // Variable to hold the candidate for majority element
        int count = 0; // Counter for the candidate

        // Iterate through the array to find the majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Set the current number as the candidate
                count = 1; // Reset count for the new candidate
            } else if (num == candidate) {
                count++; // Increment count if the current number is the same as the candidate
            } else {
                count--; // Decrement count if the current number is different
            }
        }

        return candidate; // Return the majority element
    }
}