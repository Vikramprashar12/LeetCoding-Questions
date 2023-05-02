class Solution {
    public int arraySign(int[] nums) {
                boolean sign = false;
        for (int i = 0; i < nums.length; i++) {
            if (Math.signum(nums[i]) == -1) {
                sign = !sign;
            } else if (nums[i] == 0)
                return 0;
        }

        return !sign ? 1 : -1;
    }
}