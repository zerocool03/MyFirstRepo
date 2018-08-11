import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SHKNUM {
public static void main(String[] args) {
	try
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(bufferedReader.readLine());
		StringBuilder sb = new StringBuilder();
		 
		while(testcase-->0)
		{
			int N = Integer.parseInt(bufferedReader.readLine());
			String s = Integer.toBinaryString(N);
			int len = s.length();
			int nearest2pow = (int) (N - Math.pow(2,len-1));
			if(nearest2pow==0)
			{
				nearest2pow = (int) (N - Math.pow(2,len-2));
				len = len-1;
			}
			String s1 = Integer.toBinaryString(nearest2pow);
			int len1 = s1.length();
			if(len == len1)
				len1--;
			
			int nearest2pw = (int) (nearest2pow - Math.pow(2, len1-1));
			sb.append(nearest2pw+"\n");
			
		}
		System.out.println(sb.toString());
	}
	catch(Exception e)
	{
		
	}
}
}
