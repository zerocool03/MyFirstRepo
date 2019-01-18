
public class SubStringPalin {
	public static void main(String[] args) {
		String s = " ";
		System.out.println(new SubStringPalin().longestPalindrome(s));
	}

	public String longestPalindrome(String s) {

		String ans = new String();
		if (s.equals(null))
			return null;
		if (s.length() == 1)
			return s;

		int maxLen = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String temp = s.substring(i, j);
				StringBuilder sb = new StringBuilder(temp);
				if (sb.toString().equals(sb.reverse().toString())) {
					if (maxLen <= sb.length()) {
						maxLen = sb.length();
						ans = new String(sb.toString());
					}
				}
			}
		}

		return ans;
	}
}
