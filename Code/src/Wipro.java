import java.util.ArrayList;
import java.util.List;

public class Wipro {
	public static void main(String[] args) {

		int a[] = new int[] {1,2,3,5,5,99,21,21,-1};
		int b[] = new int[] {};
		int [] ans = solve(a, b);
		for(int i=0 ; i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}

	public static int[] solve(int[] input, int[] request) {
		try {
		List<Integer> inputList = new ArrayList<Integer>();

		List<Integer> outputList = new ArrayList<Integer>();

		for (int i = 0; i < input.length-1; i++)
			inputList.add(input[i]);

		List<Integer> requestList = new ArrayList<Integer>();
		for (int i = 0; i < request.length-1; i++)
			requestList.add(request[i]);

		for (int book : requestList) {
			if (inputList.contains(book)) {
				outputList.add(inputList.indexOf(book)+1);
				inputList.remove(inputList.indexOf(book));
			}
			else
				outputList.add(-1);
		}

		int[] output = new int[outputList.size()];
		for (int i = 0; i < outputList.size(); i++) {
			output[i] = outputList.get(i);
		}

		return output;
		}
		catch(Exception e )
		{
			
		}
		return null;
	}
}
