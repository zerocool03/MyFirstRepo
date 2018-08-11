import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpellBob {
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine());
			StringBuilder sb = new StringBuilder();
			while (testcase-- > 0) {
				char[] s1 = bufferedReader.readLine().toCharArray();
				char[] s2 = bufferedReader.readLine().toCharArray();
				String output = "bob";

				for (char ch : output.toCharArray()) {

					for (int i = 0; i < s1.length; i++) {
						if (s1[i] == ch || s2[i] == ch) {

							s1[i] = '0';
							s2[i] = '0';
							break;
						}
					}

				}
				boolean mainflag = false;
				for (int i = 0; i < s1.length; i++) {
					if (!(s1[i] == '0' && s2[i] == '0')) {
						mainflag = true;
						break;
					}
				}
				if (!mainflag)
					sb.append("yes\n");
				else {
					sb.append("no\n");
				}
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			
		}
	}

}
