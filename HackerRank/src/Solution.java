import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);

		ListNode l4 = new ListNode(5);

		Solution s = new Solution();
		s.addTwoNumbers(l1, l4);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		while (l1.next != null) {
			sb1.append(l1.val);
			l1 = l1.next;
		}
		sb1.append(l1.val);

		while (l2.next != null) {
			sb2.append(l2.val);
			l2 = l2.next;
		}
		sb2.append(l2.val);

		BigInteger b1 = new BigInteger(sb1.reverse().toString());
		BigInteger b2 = new BigInteger(sb2.reverse().toString());

		// Long res = Long.parseLong(sb1.reverse().toString()) +
		// Long.parseLong(sb2.reverse().toString());

		String r = String.valueOf(b1.add(b2));
		StringBuilder s = new StringBuilder(r);

		List<ListNode> list = new ArrayList<ListNode>();
		for (int i = s.length() - 1; i >= 0; --i) {
			int temp = Integer.parseInt(Character.toString(s.charAt(i)));
			ListNode l = new ListNode(temp);
			list.add(l);
		}

		for (int i = 0; i < list.size() - 1; i++) {
			ListNode t = list.get(i);
			ListNode t2 = list.get(i + 1);
			t.next = t2;
		}
		return list.get(0);

	}
}
