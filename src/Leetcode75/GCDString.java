package Leetcode75;

class GCDString {
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenated strings are equal in both orders
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Get the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    // Helper method to compute GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
