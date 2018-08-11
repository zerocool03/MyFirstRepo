import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class PCJ18A {
	public static void main(String[] args) {

		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine());
			StringBuilder sb = new StringBuilder();

			while (testcase-- > 0) {
				StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
				int N = 0, X = 0;
				List<Integer> arr = new ArrayList<Integer>();
				while (st.hasMoreTokens()) {
					N = Integer.parseInt(st.nextToken());

				}
				StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
				while (st1.hasMoreTokens()) {
					arr.add(Integer.parseInt(st1.nextToken()));
				}
				boolean flag = false;
				Iterator<Integer> itr = arr.iterator();
				while (itr.hasNext()) {
					if (itr.next() >= X) {
						flag = true;

						break;
					}
				}
				if (flag) {
					sb.append("YES\n");
				} else {
					sb.append("NO\n");
				}

			}
			System.out.println(sb);
		} catch (Exception e) {

		}
	}
}