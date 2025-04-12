package Leetcode75.TwoPointer;


//TC  = O(n)
//SP = O(1)
public class MoveZeros {

    void moveZeroLeft(int [] nums) {
        int left = 0; // Pointer for placing the non-Zeros

        // Iterate with right pointer
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                //Swap Elements if right pointer finds a non-zero
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}
