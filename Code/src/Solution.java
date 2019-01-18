import java.util.ArrayList;
import java.util.List;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	public String toString() {
		return String.valueOf(val);
	}
}

public class Solution {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		Solution s = new Solution();
		ListNode ans = s.addTwoNumbers(l1, l2);
		while (ans != null ) {
			System.out.println(ans.val);
			ans = ans.next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		do {

			sb1.append(l1.val);
			sb2.append(l2.val);
			l2 = l2.next;

		} while ((l1 = l1.next) != null);

		String str1 = sb1.toString();
		String str2 = sb2.toString();

		StringBuilder sb3 = new StringBuilder();
		StringBuilder sb4 = new StringBuilder();

		for (int i = str1.length() - 1; i >= 0; --i) {
			sb3.append(str1.charAt(i));
			sb4.append(str2.charAt(i));
		}

		int n = Integer.parseInt(sb3.toString());
		int m = Integer.parseInt(sb4.toString());

		int res = n + m;

		List<ListNode> mySol = new ArrayList<ListNode>();
		

		
		while (res > 0) {

			int rem = res % 10;
			res = res / 10;

			ListNode temp = new ListNode(rem);
			mySol.add(temp);

		}
		ListNode answer = mySol.get(0);
		for(int i=1;i<mySol.size();i++)
		{
			
			ListNode temp2 = mySol.get(i);
			answer=temp2;
			
		}
		

		return answer;
	}
}
