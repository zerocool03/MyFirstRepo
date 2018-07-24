import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MassCalc {
	public static void main(String[] args) {

		/*
		 * COOH CH(CO2H)3 ((CH)2(OH2H)(C(H))O)3
		 * 
		 * 45 148 222
		 */

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			int totalsum = 0;
			for (int i = 0; i < s.length(); i++) {
				int sum = findMassofMolecule(i, s);
				if ((int) s.charAt(i) >= 50 && (int) s.charAt(i) <= 57) {
					sum = sum * (int) s.charAt(i);
				}
				totalsum = totalsum + sum;
			}

			System.out.println(totalsum);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int findMassofMolecule(int i, String s) {
		// TODO Auto-generated method stub
		int sum = 0;
		if (s.charAt(i) == '(') {
			sum = sum + findMassofMolecule(i + 1, s);
		}
		if (s.charAt(i) == ')') {
			return sum;
		} else if (s.charAt(i) == 'H' || s.charAt(i) == 'C' || s.charAt(i) == 'O') {
			sum = findMassofatom(s.charAt(i));
			if((int)s.charAt(i+1) >=50 && (int)s.charAt(i+1)<=57)
			{
				sum = sum * (int)s.charAt(i+1);
			}
			return sum + findMassofMolecule(i + 2, s);
		}

		return sum;
	}

	private static int findMassofatom(char ch) {
		// TODO Auto-generated method stub
		if (ch == 'H')
			return 1;
		else if (ch == 'C')
			return 12;
		else if (ch == 'O')
			return 16;
		return 0;
	}
}
