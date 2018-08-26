import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class EID {
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine());
			StringBuilder sb = new StringBuilder();

			while (testcase-- > 0) {
				StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
				int N = 0;
				while(st.hasMoreElements())
				{
					N  = Integer.parseInt(st.nextToken());
				}
				List<Integer> arr = new ArrayList<Integer>();
				StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
				while(st1.hasMoreTokens())
				{
					arr.add(Integer.parseInt(st1.nextToken()));
				}
				Collections.sort(arr);
				List<Integer> arr1 = new ArrayList<Integer>();
				for( int i=0;i<arr.size()-1;i++)
				{
					arr1.add(arr.get(i+1) - arr.get(i));
				}
				Collections.sort(arr1);
				sb.append(arr1.get(0)+"\n");
			}
			System.out.println(sb);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}
