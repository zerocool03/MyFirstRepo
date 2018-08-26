import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LRPRINT {
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine().trim());
			StringBuilder sb = new StringBuilder();

			while (testcase-- > 0) {
				String s = bufferedReader.readLine();
				char ch[] = s.toCharArray();
				StringBuilder sb1 = new StringBuilder();
				StringBuilder sb2 = new StringBuilder();

				for (char c : ch) {
					if (c >= 65 && c <= 90) {
						sb1.append(c);
					} else
						sb2.append(c);
				}
				sb.append(sb1.toString() + sb2.toString()+"\n");

			}
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
