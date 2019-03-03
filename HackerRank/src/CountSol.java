import java.util.ArrayList;
import java.util.List;

public class CountSol {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		for (int a = 0; a < 1000; a++) {
			for (int b = 0; b < 1000; b++) {
				for (int c = 0; c < 1000; c++) {
					for (int d = 0; d < 1000; d++) {
						System.out.print(a + (int) Math.pow(b, 2) + (int) Math.pow(c, 3) + (int) Math.pow(d, 4) + " ");
						arr.add(a + (int) Math.pow(b, 2) + (int) Math.pow(c, 3) + (int) Math.pow(d, 4));
					}
				}
			}
		}
		
		System.out.println(arr);
	}
}
