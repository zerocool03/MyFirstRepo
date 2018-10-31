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
				String res;
				if (N == 2 && M == 2) {
					res = "Chefirnemo";
					
				}

				int ans1 = find(N, X);
				int ans2 = find(M, Y);
				if (ans1 == 1) {
					if (ans2 == M) {
						res = "Chefirnemo" ;
						
					}
					else
					res= result(ans2 + 1, M);

				}
				if (ans2 == 1) {
					if (ans1 == N) {
						res = "Chefirnemo";
						
					}
					else
					res = result(ans1 + 1, N);
				}
				if (ans1 == N && ans2 == M) {
					res = "Chefirnemo" ;
					continue;

				}
				ans1++;
				ans2++;
				if (ans1 == N && ans2 == M) {
					res = "Chefirnemo" ;
					continue;

				} else
					res = "Pofik" ;
				
			}

			System.out.print(sb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static String result(int ans, int m) {
		if (ans == m)

			return ("Chefirnemo");

		return ("Pofik");

	}

	private static int find(int n, int x) {
		// TODO Auto-generated method stub
		if (x == 1) {
			return 1;
		}
		if(x>=n)
		{
			return x+1;
		}
		int temp = (n - 1) / x;
		return (1 + (temp * x));

	}

}