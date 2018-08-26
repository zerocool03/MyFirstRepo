import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class DEANSAM {
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//			int testcase = Integer.parseInt(bufferedReader.readLine().trim());
			// StringBuilder sb = new StringBuilder();

//			while (testcase-- > 0) {
			int N = Integer.parseInt(bufferedReader.readLine());
			List<Integer> arr = new ArrayList<Integer>();
			List<Integer> result = new ArrayList<Integer>();
			StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
			while (st.hasMoreTokens()) {

				arr.add(Integer.parseInt(st.nextToken()));

			}

			for (int i = 0; i < arr.size(); i++) {
				int sum = 0;
				for (int j = i; j < arr.size(); j++) {
					sum = sum + arr.get(j);
					result.add(sum);
				}
			}
			Collections.sort(result);
			System.out.println(result.get(0) + "\n");
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
