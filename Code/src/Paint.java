import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Paint {

	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(bufferedReader.readLine());
        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int n =0,k=0;
            while(st.hasMoreTokens())
            {
             n = Integer.parseInt(st.nextToken());
             k = Integer.parseInt(st.nextToken());
            }
            String s = bufferedReader.readLine();
            int arr[] = new int[s.length()+1];
            int ans = 0;
            for(int i = 0; i < s.length(); i++){
            	char ch = s.charAt(i);
            	if(i > 0)
            		arr[i] += arr[i-1];
            	if((arr[i] % 2 == 0 && ch == 'R')
            		|| (arr[i] % 2 != 0 && ch == 'G')){
            		arr[i] += 1;
            		if(i + k >= n){
            			arr[n] -= 1;
            		}else{
            			arr[i+k] -= 1;
            		}
            		ans += 1;
            	}
            	
            	//System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
        }
	}
		catch(Exception e)
		{
			
		}
}
}
