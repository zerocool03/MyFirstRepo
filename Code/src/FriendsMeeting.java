import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class FriendsMeeting {
	public static void main(String[] args) {
		
	
	try {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int testcase = Integer.parseInt(br.readLine());
	StringBuilder sb = new StringBuilder();
	while (testcase-- != 0) {
		int n = Integer.parseInt(br.readLine());
		List<Integer> arrList = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens())
		{
			arrList.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(arrList);
		
		
	}
	
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}