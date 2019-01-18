import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncSeq {
	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(bufferedReader.readLine());
		StringBuilder answer = new StringBuilder();

		while (testcase-- > 0) {
			int size = Integer.parseInt(bufferedReader.readLine());
			StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
			int[] arr = new int[size];
			int[] LCS = new int[size];
			int k = 0;
			while (st.hasMoreTokens()) {
				arr[k] = Integer.parseInt(st.nextToken());
				LCS[k] = 1;
				k++;
			}
			int count = minRemove(arr, size, LCS);

			answer.append(count + "\n");
		}
		System.out.println(answer);
	}

	static int minRemove(int arr[], int n, int[] LCS) {

		int len = 0;
// Find LCS of array
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && (i - j) <= (arr[i] - arr[j]))
					LCS[i] = Math.max(LCS[i], LCS[j] + 1);
			}
			len = Math.max(len, LCS[i]);
		}

		// Return min changes for array
		// to strictly increasing
		return n - len;
	}
}
