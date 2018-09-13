import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHEFADV {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			while (testcase-- != 0) {
				int N = 0, M = 0, X = 0, Y = 0;
				StringTokenizer st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					N = Integer.parseInt(st.nextToken());
					M = Integer.parseInt(st.nextToken());
					X = Integer.parseInt(st.nextToken());
					Y = Integer.parseInt(st.nextToken());
				}

				if (N == 2 && M == 2) {
					sb.append("Chefirnemo" + "\n");
					continue;
				}

				int x = (N - 1) / X;
				int y = (M - 1) / Y;
				int ans1 = 1 + (X * x);
				int ans2 = 1 + (Y * y);
				if (ans1 == N && ans2 == M) {
					sb.append("Chefirnemo" + "\n");
					continue;
				}
				ans1++;
				ans2++;
				if (ans1 == N && ans2 == M) {
					sb.append("Chefirnemo" + "\n");

				} else
					sb.append("Pofik" + "\n");

			}

			System.out.println(sb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}