import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class CEW2 {
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine());
			StringBuilder sb = new StringBuilder();

			while (testcase-- > 0) {
				StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
				String first = null;
				StringBuilder sb1 = new StringBuilder();
				sb1.append(0);

				StringBuilder sb2 = new StringBuilder();
				sb2.append(0);
				String second = null;

				while (st.hasMoreTokens()) {
					first = (st.nextToken());
					second = (st.nextToken());
				}
				for (int i = 0; i < first.length(); i++) {
					if (first.charAt(i) == '1') {
						sb1.append(1);
					}
				}
				for (int i = 0; i < second.length(); i++) {
					if (second.charAt(i) == '1') {
						sb2.append(1);
					}
				}
				sb.append(new BigInteger(sb1.toString()).multiply(new BigInteger(sb2.toString()))).append("\n");

			}
			System.out.println(sb);
		} catch (Exception e) {
			// e.printStackTrace();
		}

	}
}
