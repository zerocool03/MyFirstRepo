import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fighting {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int count = 0;
		while (testCase-- > 0) {
			int a = 0, b = 0, c = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				c = Integer.parseInt(st.nextToken());
			}

			int d = b * b - 4 * a * c;
			if (d > 0 || d == 0) {
				count++;
			}

		}
		System.out.println(count);

	}

}
