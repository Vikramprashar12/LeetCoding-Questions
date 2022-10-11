
class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode head = new ListNode();
		ListNode p = l1, q = l2, current = head;
		while (p != null || q != null) {
			int x = p != null ? p.val : 0;
			int y = q != null ? q.val : 0;
			int sum = x + y + carry;
			carry = sum / 10;
			current.next = new ListNode(sum % 10);
			current = current.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry == 1) {
			current.next = new ListNode(carry);
		}

		return head.next;
	}
}