public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k is greater than n
        int count = 0; // Count of elements rotated
        for (int start = 0; count < n; start++) {
            int current = start;
            int prevValue = nums[start];
            do {
                int nextIndex = (current + k) % n;
                int temp = nums[nextIndex];
                nums[nextIndex] = prevValue;
                prevValue = temp;
                current = nextIndex;
                count++;
            } while (start != current);
        }
    }
}
