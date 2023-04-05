class Solution {
    public int minimizeArrayValue(int[] nums) {
		long total = 0;
		int minOfMax = -1;
		for (int i = 0; i < nums.length; ++i) {
			total += nums[i];
			minOfMax = Math.max(minOfMax, (int) Math.ceil(((total)*1.0 / (i + 1)*1.0)));
		}

		return minOfMax;
    }
    
}