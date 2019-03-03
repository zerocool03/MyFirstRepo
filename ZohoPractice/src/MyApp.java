import java.util.Arrays;

public class MyApp {
	public static void main(String[] args) {
		MyApp app = new MyApp();
//		String s = "PROGRAM";
//		// app.printPatter(s);
//		MyApp.convertFive(1004);
		char[] ch = { 'a', 'b','a'};
		System.out.println(app.compress(ch));
	}

	void printPatter(String s) {
		int len = s.length();
		int P = 0;
		int index = 0;
		String d = s.substring(len / 2, s.length());
		String g = s.substring(0, len / 2);
		String ans = d.concat(g);
		for (int i = 0; i < len; i++) {
			P += 2;
			for (int j = 0; j < len * 2 - P; j++) {
				System.out.print(" ");
			}
			System.out.print(ans.substring(0, ++index));
			System.out.print("$");
		}
		System.out.println();

	}

	public static void convertFive(int n) {
		String s = String.valueOf(n);
		String res = s.replaceAll("0", "5");
		System.out.println(res);
	}

	public int compress(char[] chars) {
		if (chars != null) {

			StringBuilder sb = new StringBuilder();
			int count = 1;
			boolean countflg = false;
			for (int i = 0; i < chars.length; i++) {
				if (sb.length() <= 0) {
					sb.append(chars[i]);
					continue;
				}
				char lastele = sb.charAt(sb.length() - 1);
				countflg = false;
				if (lastele == chars[i])
				{
					count++;
				countflg=true;
				}
				else {
					if(count!=1)
					sb.append(count);
					sb.append(chars[i]);
					count = 1;
					countflg=false;
				}

			}
			
			if(countflg)
			sb.append(count);
			for(int i=0;i<sb.length();i++)
			{
				chars[i] = sb.charAt(i);
			}
			System.out.println(sb);
			return sb.length();
		}
		return 0;

	}
}
