class Solution {
    public int maxVowels(String s, int k) {
        int leftPointer = 0, rightPointer = k - 1, runningVowelCount = 0;
        // initialize left, right,

        for (int i = 0; i <= rightPointer; i++) {// calculate the number of vowels in the window
            runningVowelCount += isVowel(s.charAt(i)) ? 1 : 0;
        }
        int maxVowelsCount = runningVowelCount;
        while (rightPointer < s.length() - 1) {
            if (isVowel(s.charAt(leftPointer++))) {
                runningVowelCount--;
            }
            if (isVowel(s.charAt(++rightPointer))) {
                runningVowelCount++;
            }
            maxVowelsCount = runningVowelCount > maxVowelsCount ? runningVowelCount : maxVowelsCount;
        }

        return maxVowelsCount;
    }
        public static boolean isVowel(char a) {
        return a == 'a' || a == 'e' || a == 'i' || a == 'o'
                || a == 'u' ? true : false;
    }
}