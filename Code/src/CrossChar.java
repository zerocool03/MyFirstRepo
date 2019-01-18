import java.util.Scanner;

public class CrossChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str.length(); j++) {
					if (i == j)
						System.out.print(str.charAt(i) + " ");
					else if (i + j == str.length() - 1)
						System.out.print(str.charAt(str.length() - 1 - i) + " ");
					else
						System.out.print(" ");
				}
				//System.out.println();
			}
		}
	}
}
