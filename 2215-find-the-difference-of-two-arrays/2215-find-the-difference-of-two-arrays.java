class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            if (Arrays.binarySearch(nums2, nums1[i]) < 0 && !(list.get(0).contains(nums1[i]))) {
                list.get(0).add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (Arrays.binarySearch(nums1, nums2[i]) < 0 && !(list.get(1).contains(nums2[i]))) {
                list.get(1).add(nums2[i]);
            }
        }
        return list;
    }
}