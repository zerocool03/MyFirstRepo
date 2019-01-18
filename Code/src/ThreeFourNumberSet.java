import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeFourNumberSet extends Object{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n++;
		String bin = Integer.toBinaryString(n);
		int noofDigits = bin.length() - 1;
		int len = 1 << noofDigits;
		List<StringBuilder> res = new ArrayList<StringBuilder>();
		for (int i = 0; i < len; i++) {
			StringBuilder sb = new StringBuilder();
			int mask = 1;
			for (int j = 0; j < noofDigits; j++) {
				if ((mask & i) != 0) {
					sb.append(4);
				} else
					sb.append(3);

				mask = mask << 1;
			}
			res.add(sb);
		}
		int arr[] = new int[res.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(res.get(i).toString());
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+", ");
		System.out.println();
		System.out.println(arr[n - len]);
		sc.close();
	}
}
