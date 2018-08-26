import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpellBob {
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine());
			StringBuilder sb = new StringBuilder();
			while (testcase-- > 0) {
				String s1 = bufferedReader.readLine();
				String s2 = bufferedReader.readLine();

				boolean mainflag = false;
				if ((s1.charAt(0) == 'b' || s2.charAt(0) == 'b') && (s1.charAt(1) == 'b' || s2.charAt(1) == 'b')
						&& (s1.charAt(2) == 'o' || s2.charAt(2) == 'o'))

					mainflag = true;

				else if ((s1.charAt(0) == 'b' || s2.charAt(0) == 'b') && (s1.charAt(1) == 'o' || s2.charAt(1) == 'o')
						&& (s1.charAt(2) == 'b' || s2.charAt(2) == 'b'))

					mainflag = true;
				else if ((s1.charAt(0) == 'o' || s2.charAt(0) == 'o') && (s1.charAt(1) == 'b' || s2.charAt(1) == 'b')
						&& (s1.charAt(2) == 'b' || s2.charAt(2) == 'b'))

					mainflag = true;

				if (mainflag)
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
