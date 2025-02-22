class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1, nums2, and the end of the merged array
        int i = m - 1; // Last element in nums1's valid part
        int j = n - 1; // Last element in nums2
        int k = m + n - 1; // Last position in nums1

        // Merge nums1 and nums2 from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--; // Removed the invalid characters
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        // No need to copy the remaining elements of nums1, they are already in place
    }
}