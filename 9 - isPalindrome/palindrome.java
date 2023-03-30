
public class palindrome {

	public static boolean isPalindrome(int x) {
		int reverse = 0;
		int temp = x;
		while (temp != 0) {
			int lastDigit = temp % 10;
			reverse = (reverse * 10) + lastDigit;
			temp = temp / 10;
		}
		if (x < 0)
			return false;
		return (reverse == x ? true : false);

	}

}
