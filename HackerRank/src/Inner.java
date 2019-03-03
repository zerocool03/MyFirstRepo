import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Inner {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> arr = new ArrayList<Integer>();

		while (st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		int K = Integer.parseInt(br.readLine());
		if (!arr.isEmpty()) {
			System.out.println(find(arr, K));
		}

	}

	static int find(List<Integer> arr, int K) {
		TreeSet<Integer> ans = new TreeSet<Integer>();
		List<Integer> summa = new ArrayList<Integer>();
		for (int i = 0; i < arr.size(); i++) {
			int count = 1;

			for (int j = i ; j < arr.size(); j++) {
				int temp = arr.get(j) * K;
				if (arr.contains(temp)) {
					count++;
					j = arr.indexOf(temp) - 1;
				}
			}
			ans.add(count);
			summa.add(count);
		}
		System.out.println(ans);
		System.out.println(summa);
		return ans.last();
	}

}
