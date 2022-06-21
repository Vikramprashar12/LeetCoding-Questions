class Solution {
    public int lengthOfLongestSubstring(String s) {
		int length = 0;
		for (int i = 0; i <= s.length(); i++) {
			int proposed = 0;
			ArrayList<Character> elements = new ArrayList<Character>();
			for (int c = i; c < s.length(); c++) {
				if (elements.contains(s.charAt(c))) {
					break;
				}
				elements.add(s.charAt(c));
			}
			
			proposed = elements.size();
			length = proposed > length ? proposed : length;
		}
		return length;
    }
}