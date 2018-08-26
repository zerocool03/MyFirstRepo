import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BUG2K18A {
	public static void main(String[] args) {

		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine());
			StringBuilder sb = new StringBuilder();

			while (testcase-- > 0) {
				StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
				int N = 0, R = 0;
				int Y = 0;
				while (st.hasMoreTokens()) {
					N = Integer.parseInt(st.nextToken());
					R = Integer.parseInt(st.nextToken());

				}
				StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());

				while (st1.hasMoreTokens()) {
					int temp = Integer.parseInt(st1.nextToken());

					if (temp <= R) {
						Y++;
					}
				}
				sb.append(N + " " + Y + " " + Y + "\n");
			}
			System.out.println(sb);
		} catch (Exception e) {

		}
	}
}