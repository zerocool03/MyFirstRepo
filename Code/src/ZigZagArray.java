import java.util.Scanner;

public class ZigZagArray {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int start = 0;
		
		

		for (int i = 1; i <= N; i++) {
			if (i % 2 != 0) {

				for (int j = 0; j < i; j++) {
					System.out.print(++start + " ");
				}
				System.out.println();
			} else {

				int lim = start + i;
				int temp = lim;
				// System.out.println("lim and start"+lim +" "+start);
				for (int j = lim; j > start; j--) {
					System.out.print(lim-- + " ");
				}
				start = temp;
				System.out.println();
			}
		}
	}
}
