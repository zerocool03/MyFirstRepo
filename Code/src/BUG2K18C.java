import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BUG2K18C {
	public static void main(String[] args) {

		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine());
			StringBuilder sb = new StringBuilder();

			while (testcase-- > 0) {
				String s1 = null, s2 = null;
				StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
				while (st.hasMoreTokens()) {
					s1 = st.nextToken();
					s2 = st.nextToken();
				}
				char[] s1char = s1.toCharArray();
				char[] s2char = s2.toCharArray();
				for (int i = 0; i < s1.length(); i++) {
					for (int j = 0; j < s2.length(); j++) {
						if (s1char[i] == s2char[j]) {

							s1char[i] = s2char[j] = '?';
							break;
						}
					}
				}
				boolean flag = false;
				for (int i = 0; i < s1char.length; i++) {
					if (s1char[i] != '?') {
						flag = true;

						break;
					}
				}
				if (!flag)
					sb.append("Yes" + "\n");
				else
					sb.append("No" + "\n");
			}
			System.out.println(sb);
		}

		catch (Exception e) {

		}
	}
}
