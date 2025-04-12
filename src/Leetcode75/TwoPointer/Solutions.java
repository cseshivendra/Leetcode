package Leetcode75.TwoPointer;

import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int operations = 0;

        // Count the frequency of each number in the array
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the unique numbers in the map
        for (int num : countMap.keySet()) {
            int complement = k - num;

            // Check if the complement exists in the map
            if (countMap.containsKey(complement)) {
                if (num == complement) {
                    // If num and complement are the same, we can only pair them with themselves
                    operations += countMap.get(num) / 2;
                } else {
                    // Pair num with its complement
                    int pairs = Math.min(countMap.get(num), countMap.get(complement));
                    operations += pairs;

                    // Update the counts in the map
                    countMap.put(num, countMap.get(num) - pairs);
                    countMap.put(complement, countMap.get(complement) - pairs);
                }
            }
        }

        return operations;
    }
}