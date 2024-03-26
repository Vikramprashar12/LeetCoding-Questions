class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dupes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                dupes.add(Math.abs(nums[i]));
            }
            nums[Math.abs(nums[i]) - 1] *= -1;
        }
        return dupes;
    }
}