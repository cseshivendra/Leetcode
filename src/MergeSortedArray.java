import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public int[] mergeNsort(int[] arr, int[] brr) {
        // Sort both arrays
        Arrays.sort(arr);
        Arrays.sort(brr);

        // Create a temporary array with a maximum possible size
        int[] temp = new int[arr.length + brr.length];
        HashSet<Integer> set = new HashSet<>();

        int i = 0, j = 0, k = 0; // k will track the index for temp

        // Merge the two sorted arrays
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                if (set.add(arr[i])) { // Only add if it's unique
                    temp[k++] = arr[i]; // Add to temp and increment k
                }
                i++;
            } else {
                if (set.add(brr[j])) { // Only add if it's unique
                    temp[k++] = brr[j]; // Add to temp and increment k
                }
                j++;
            }
        }

        // Add remaining elements from arr
        while (i < arr.length) {
            if (set.add(arr[i])) { // Only add if it's unique
                temp[k++] = arr[i]; // Add to temp and increment k
            }
            i++;
        }

        // Add remaining elements from brr
        while (j < brr.length) {
            if (set.add(brr[j])) { // Only add if it's unique
                temp[k++] = brr[j]; // Add to temp and increment k
            }
            j++;
        }

        // Create a new array of the correct size to return
        int[] resultArray = new int[k];
        for (int m = 0; m < k; m++) {
            resultArray[m] = temp[m]; // Copy unique elements to resultArray
        }

        return resultArray;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of test cases: ");
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            System.out.print("Enter first array elements (space-separated): ");
            String[] input1 = br.readLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }
//            sc.next();
            System.out.print("Enter second array elements (space-separated): ");
            String[] input2 = br.readLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int[] res = ob.mergeNsort(arr, brr);

            // Printing the result
            System.out.print("Merged and sorted unique elements: ");
            for (int num : res) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

//        sc.close();
    }
}