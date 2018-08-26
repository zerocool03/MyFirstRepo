import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CIELRCPT {
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine().trim());
			StringBuilder sb = new StringBuilder();

			while (testcase-- > 0) {
				int N = Integer.parseInt(bufferedReader.readLine());
				int result = 0;

				while (N > 2048) {
					N = N - 2048;
					result++;
				}

				String bincov = Integer.toBinaryString(N);
				char ch[] = bincov.toCharArray();
				for (char c : ch) {
					if (c == '1')
						result++;
				}
				sb.append(result + " ");
			}
			System.out.println(sb);
			String s = "admin";
//		    byte[] bytes = s.getBytes("US-ASCII");
//		    for(byte b : bytes)
//		    System.out.println(b+" ");
		} catch (Exception e) {

		}
	}
}