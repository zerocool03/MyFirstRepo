import java.util.Arrays;

public class Squares {

	public static void main(String[] args) {
		Squares s = new Squares();
//		int temp[] = s.sortedSquares(new int[] { 10000 });
//		for (int i = 0; i < temp.length; i++) {
//			System.out.print(temp[i] + ",");
//		}
		
		System.out.println(s.strWithout3a3b(1, 2));

	}

	public int[] sortedSquares(int[] A) {
		int[] ans = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			ans[i] = (A[i] * A[i]);
		}
		Arrays.sort(ans);
		return ans;
	}

	public String strWithout3a3b(int A, int B) {
		return null;
		
	}
}
