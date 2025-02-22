class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the position of the next non-val element
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place the non-val element at the k-th position
                k++; // Increment k
            }
        }
        
        return k; // Return the count of non-val elements
    }
}