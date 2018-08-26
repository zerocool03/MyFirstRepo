import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROBSET {
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(bufferedReader.readLine());
			StringBuilder sb = new StringBuilder();

			while (testcase-- > 0) {
				StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
				int N=0,M=0;
				while(st.hasMoreTokens())
				{
					N = Integer.parseInt(st.nextToken());
					M = Integer.parseInt(st.nextToken());
				}
				boolean flag = false;
				while(N-->0)
				{
					String indent = null ;
					String output = null ;
					StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
					while(st1.hasMoreTokens())
					{
						 indent = st1.nextToken();
						 output = st1.nextToken();
					}
					if(!flag) {
					if(indent.equals("correct"))
					{
						char [] ch = output.toCharArray();
						for(char c : ch)
						{
							if(c=='0')
							{
								sb.append("INVAILD"+"\n");
								flag = true;
								break;
								
							}
						}
					}
					else
					{
						boolean flag1 = false; 
						char [] ch = output.toCharArray();
						for(char c : ch)
						{
							if(c=='0')
							{
								flag1=true;
								break;
							}
						}
						if(!flag1)
						{
							sb.append("WEAK"+"\n");
						}
						
						
					}
				}
				}
			}
		}
		catch(Exception e)
		{
			
		}

}
}