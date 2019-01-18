import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Message {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int test = sc.nextInt();
		while (test-- > 0) {
			String str = sc.next();
			sb.append(SubString(str, str.length()) + "\n");
		}
		System.out.println(sb);
		sc.close();

	}

	public static int SubString(String str, int n) {
		List<String> ans = new ArrayList<String>();
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j <= n; j++) {
				String temp = new String(str.substring(i, j));
				if (temp.contains("a") || temp.contains("z")) {
					ans.add(temp);
				}

			}

		return ans.size();
	}
}
