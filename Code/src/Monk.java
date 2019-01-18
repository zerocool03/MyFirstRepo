import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Monk {
	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(bufferedReader.readLine());
		int count[] = new int[size];
		int k = 0;
		StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
		StringTokenizer st2 = new StringTokenizer(bufferedReader.readLine());

		while (st1.hasMoreTokens() && st2.hasMoreTokens()) {
			int temp1 = Integer.parseInt(st1.nextToken());
			int temp2 = Integer.parseInt(st2.nextToken());
			count[k++] = temp1 + temp2;
		}

		for (int i = 0; i < size; i++) {
			System.out.print(count[i] + " ");
		}

	}
}
