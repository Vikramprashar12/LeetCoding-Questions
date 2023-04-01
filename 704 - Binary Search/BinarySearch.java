
public class BinarySearch {
	public static int search(int[] nums, int target) {
		boolean check = true;
		int middle = nums.length / 2;
		while (check) {
			
			if (target < nums[middle]) {
				middle = middle/2;
			} else if (target > nums[middle]) {
				middle=middle+middle/2;
			} else
				return middle;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		System.out.println(search(nums,2));
	}
}
