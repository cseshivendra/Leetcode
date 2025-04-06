package Leetcode75;

public class ReverseVowel {
    public static String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] charArray = s.toCharArray();

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        while (i < j) {
            // Find the vowel from the beginning
            while (i < j && !vowels.contains(charArray[i])) {
                i++;
            }

            // Find the vowel from the end
            while (i < j && !vowels.contains(charArray[j])) {
                j--;
            }

            // Swap the vowels
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

            i++;
            j--;
        }

        return new String(charArray);
    }
}
