import java.util.Scanner;

public class Regex {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String patter = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(str);
		sb.append(patter.charAt(0));
		for (int i = 1; i < patter.length(); i++) {
			if (patter.charAt(i) != patter.charAt(i - 1)) {
				sb.append(patter.charAt(i));
			}

		}
		boolean starFlag = false;
		boolean quesFlag = false;
		int nextvisttoIndex = 0;
		boolean nomatching = false;
		for (int i = 0; i < sb.length(); i++) {
			if (nomatching) {
				System.out.println("No");
				break;
			}

			char ch = sb.charAt(i);
			if (ch == '*') {
				starFlag = true;
				continue;
			}
			if (ch == '?') {
				quesFlag = true;

			}
			if (starFlag) {
				for (int j = nextvisttoIndex; j < str.length(); j++) {

					if (str.charAt(j) == ch) {
						starFlag = false;
						sb1.deleteCharAt(j);
						nextvisttoIndex = j + 1;
						break;

					} else {
						nomatching = true;
						break;
					}
				}
			} else if (quesFlag) {
				sb1.deleteCharAt(nextvisttoIndex);
				nextvisttoIndex = nextvisttoIndex + 1;
				if (nextvisttoIndex == str.length()) {
					nomatching = true;
					continue;

				}

				quesFlag = false;

			} else {
				if (str.charAt(nextvisttoIndex) == ch) {
					sb1.deleteCharAt(nextvisttoIndex);
					nextvisttoIndex = nextvisttoIndex + 1;

				} else {
					nomatching = true;

				}
			}

		}
		System.out.println(sb1.toString());
	}

}
