import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LongestSubString {
	public static void main(String[] args) {

		String str = " ";
		System.out.println(loge(str));

	}

	static int loge(String s) {
		if (s.equals("")) {
			return 0;
		}

		List<Character> arr = new ArrayList<Character>();
		Set<Integer> ans = new TreeSet<Integer>();
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {

			for (int j = i; j < s.length(); j++) {

				if (arr.contains(s.charAt(j))) {

					break;
				} else {
					arr.add(s.charAt(j));
				}
			}
			ans.add(arr.size());
			arr = new ArrayList<Character>();

		}

		res.addAll(ans);

		return res.get(res.size() - 1);

	}

}
