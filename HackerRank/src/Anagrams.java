import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Anagrams {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int count = 0;
		List<String> arr = new ArrayList<String>();

		while (testCase-- > 0) {
			String temp = br.readLine();

			boolean flag = false;
			for (int i = 0; i < arr.size(); i++) {
				if (temp.length() == arr.get(i).length()) {
					if (temp.charAt(0) == arr.get(i).charAt(0)
							&& temp.charAt(temp.length() - 1) == arr.get(i).charAt(arr.get(i).length() - 1)) {

						StringBuilder sb1 = new StringBuilder(temp);
						StringBuilder sb2 = new StringBuilder(arr.get(i));
						for (int j = 0; j < sb1.length(); j++) {
							for (int k = 0; k < sb2.length(); k++) {
								if (sb1.charAt(j) == sb2.charAt(k)) {
									sb2.deleteCharAt(k);
								}
							}
						}

						if (sb2.toString().isEmpty()) {
							flag=true;
							break;
						}
					}
				}
			}
			if(!flag)
			{
				arr.add(temp);
				count++;
			}
			

		}
		System.out.println(arr);
		System.out.println(count);

	}
}
