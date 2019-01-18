import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int testcase = Integer.parseInt(sc.nextLine());
			StringBuilder sb = new StringBuilder();
			while (testcase-- > 0) {

				int X = 0, N = 0;

				X = sc.nextInt();
				N = sc.nextInt();

				int sum = 0;
				int Y = 1;
				int temp = 0;
				while ((temp = X * Y) <= N) {
					sum = sum + temp;
					Y++;
				}
				sb.append(sum + "\n");
			}
			System.out.print(sb);
			sc.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
