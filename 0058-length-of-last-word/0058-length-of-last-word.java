class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int temp = s.lastIndexOf(" ");
        return s.length()-1-temp;
    }
}