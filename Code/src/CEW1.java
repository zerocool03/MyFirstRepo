import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CEW1 {
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine());
			StringBuilder sb = new StringBuilder();

			while (testcase-- > 0) {
				int N = Integer.parseInt(bufferedReader.readLine());
				// 2 x (N-(2 ^ floor(log2 (N) ))) + 1
				String bin = Integer.toBinaryString(N);

				int noofdi = (int) Math.log10(Double.parseDouble(bin)) + 1;
				int P = (int) Math.pow(2, noofdi);
				int M = (P - 1) - N;
				M = M * 2;
				int pos1 = (P - 1) - M;				
				int pos2 = 0;
				if (pos1 * (pos1 - 1) > N) {
					int sqrt = (int) Math.sqrt(N);
					int max = 0;
					for (int i = 1; i < sqrt; i++) {
						if ((pos1-1) % i == 0) {
							max = i;
						}
					}
					pos2 = max;
				} else {
					pos2 = pos1 * (pos1 - 1) + 1;
				}
				if (pos1 < pos2)
					sb.append(pos1 + " " + pos2).append("\n");
				else
					sb.append(pos2 + " " + pos1).append("\n");
			}
			System.out.println(sb.toString());
		} catch (Exception e) {

		}

	}
}
