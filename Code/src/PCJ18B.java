import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PCJ18B {

	public static void main(String[] args) {

		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine());
			StringBuilder sb = new StringBuilder();

			while (testcase-- > 0) {
				StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
				int N = 0;

				while (st.hasMoreTokens()) {
					N = Integer.parseInt(st.nextToken());

				}
				int sum = 0;
				while (N >= 1) {
					sum = sum + (N) * (N);
					N = N - 2;
				}
				sb.append(sum + "\n");

			}
			System.out.println(sb);
		} catch (Exception e) {

		}
	}

}
