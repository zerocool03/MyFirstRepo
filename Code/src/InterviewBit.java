import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class InterviewBit {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		int size = Integer.parseInt(br.readLine());
		while (size-- > 0) {
			ArrayList<Integer> Binner = new ArrayList<Integer>();
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			while (st1.hasMoreTokens()) {
				Binner.add(Integer.parseInt(st1.nextToken()));
			}
			B.add(Binner);
		}

		System.out.println(A);
		System.out.println(B);

		System.out.println(solve(A, B));

	}

	public static int solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
		int answer = 0;
		for (ArrayList<Integer> Binner : B) {

			if (Binner.get(0) == 1) {
				int index = (Integer) Binner.get(1) - 1;
				int newValue = (Integer) Binner.get(2);
				A.set(index, newValue);
			} else {
				int L = (Integer) Binner.get(1) - 1;
				int R = (Integer) Binner.get(2) - 1;
				for (int i = L; i <= R; i++) {
					int temp = (int) Math.round(Math.sqrt(A.get(i)));
					int nearsquare = temp * temp;
					int dup = (A.get(i) - nearsquare > 0) ? (A.get(i) - nearsquare) : (nearsquare - A.get(i));
					answer = answer + dup;
				}
			}
		}
		return answer;
	}
}
