import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SubSet {
	static boolean isSubsetSum(int set[], int n, int sum) {
// Base Cases 
		if (sum == 0)
			return true;
		if (n == 0 && sum != 0)
			return false;

		if (set[n - 1] > sum)
			return isSubsetSum(set, n - 1, sum);

		return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testcase = Integer.parseInt(bufferedReader.readLine());
		while (testcase-- > 0) {
			int size = Integer.parseInt(bufferedReader.readLine());
			;
			StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
			int set[] = new int[size];
			int k = 0;
			while (st.hasMoreTokens()) {
				set[k++] = Integer.parseInt(st.nextToken());
			}
			int sum = Integer.parseInt(bufferedReader.readLine());
			if (isSubsetSum(set, set.length, sum))

				sb.append("YES\n");

			else
				sb.append("NO\n");
		}
		System.out.println(sb);
	}

}
