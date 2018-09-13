import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MAGICHF {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			while (testcase-- != 0) {
				int N, X = 0, S = 0;
				StringTokenizer st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					N = Integer.parseInt(st.nextToken());
					X = Integer.parseInt(st.nextToken());
					S = Integer.parseInt(st.nextToken());

				}
				int currentBox = X;
				while ((S-- > 0)) {
					int A, B;
					StringTokenizer st1 = new StringTokenizer(br.readLine());
					while (st1.hasMoreTokens()) {
						A = Integer.parseInt(st1.nextToken());
						B = Integer.parseInt(st1.nextToken());
						if (currentBox == A) {
							currentBox = B;
						} else if (currentBox == B) {
							currentBox = A;
						}
					}
				}
				sb.append(currentBox + "\n");

			}
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}