import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Grap {
	public static void main(String[] args) {

		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int NoofCities = Integer.parseInt(bufferedReader.readLine());
			StringBuilder sb = new StringBuilder();
			List<String> str = new ArrayList<String>();
			List<String> visitingCities = new ArrayList<String>();
			Set<Integer> mySet = new HashSet<Integer>();
			while (NoofCities-- > 0) {
				str.add(bufferedReader.readLine());
			}
			int[][] cost = new int[NoofCities][NoofCities];
			for (int i = 0; i < NoofCities; i++) {
				StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
				for (int j = 0; j < NoofCities; j++) {
					cost[i][j] = Integer.parseInt(st.nextToken());
					mySet.add(cost[i][j]);
				}
			}
			int N = Integer.parseInt(bufferedReader.readLine());
			while (N-- > 0) {
				visitingCities.add(bufferedReader.readLine());
			}
			int ans=0;

			System.out.println(ans);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
