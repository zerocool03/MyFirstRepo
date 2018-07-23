import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Compiler {

public static void main(String[] args) {
	try
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (testcase-- != 0) {
			String s = br.readLine();
			
			char[] arr = s.toCharArray();
			Stack<Character> st = new Stack<>();
			int longestPrefix = 0;
			for (int i = 0; i < s.length(); i++) {
				
				if (arr[i] == '<') {
					st.push(arr[i]);
				} else if (arr[i] == '>') {
					if (!st.isEmpty()) {
						st.pop();
					} else {
						break;
					}
				}
				
				if (st.isEmpty())
					longestPrefix = i + 1;
				
			}
			sb.append(longestPrefix+"\n");
		}
		System.out.println(sb);
	}
			
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

}
