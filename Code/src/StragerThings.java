import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StragerThings {
	public static void main(String[] args) throws Exception {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(bufferedReader.readLine());
		StringBuilder answer = new StringBuilder();

		while (testcase-- > 0) {
			int N = Integer.parseInt(bufferedReader.readLine());
			int[] kids = new int[N];
			int k = 0;
			StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
			while (st.hasMoreTokens()) {
				kids[k++] = Integer.parseInt(st.nextToken());
			}
			long monster = Long.parseLong(bufferedReader.readLine());
			List<Long> marr = new ArrayList<Long>();
			for (long i = 0; i < monster; i++)
				marr.add(i+1);
			int count = 0;
			for (int i = 0; i < kids.length; i++) {
				int temp = kids[i];
				for (int j = temp-1; j < marr.size(); j += temp) {

					marr.set(j, -1L);

				}
			}
			for (int i = 0; i < marr.size(); i++) {
				//System.out.print(marr[i]+" ");
				if (marr.get(i) <0)
					count++;
			}
			answer.append(count + "\n");

		}
		System.out.println(answer);

	}
}
