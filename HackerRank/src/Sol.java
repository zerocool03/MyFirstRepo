import java.util.ArrayList;
import java.util.List;

public class Sol {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(1);
//		list.add(3);
		Sol.updateList(list);
		System.out.println(list);
	}

	public static void updateList(List<Integer> list) {
		// Implement this method as per the required logic
		List<Integer> arr = new ArrayList<Integer>();
		arr.addAll(list);
		boolean flag = false;
		for (int i = 1; i < arr.size() - 1; i++) {
			if (arr.get(i) < arr.get(i - 1) && arr.get(i) < arr.get(i + 1)) {
				arr.remove(i);
				flag = true;

			}
		}
		if (flag)
			updateList(arr);

		list.clear();
		;
		list.addAll(arr);

	}

	public static long listMax(int n, List<List<Integer>> operations) {
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			ans.add(0);

		for (List<Integer> s : operations) {
			List<Integer> arr = s;

			int a = arr.get(0);
			int b = arr.get(0);
			int k = arr.get(0);

			for (int i = a; i < b; i++) {
				int temp = ans.get(i) + k;
				ans.set(i, temp);
			}
		}
		int max = 0;
		for (int i = 0; i < ans.size(); i++) {
			if (ans.get(i) > max) {
				max = ans.get(i);
			}
		}

		return max;

	}

	public static int fourthBit(int num) {
		String bin = Integer.toBinaryString(num);
		System.out.println(bin);

		StringBuilder sb = new StringBuilder(bin);
		sb.reverse();
		
		if (sb.toString().length() < 4) {
			return 0;
		}
		return sb.toString().charAt(3);

	}

}
