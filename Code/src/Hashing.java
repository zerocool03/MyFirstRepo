import java.util.Scanner;

public class Hashing {

	
		public static void main (String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int t = scan.nextInt();
			
			while(t > 0) {
			    
			    int n = scan.nextInt();
			    
			    int[] pat = new int[n];
			    
			    for (int i=0; i<n; i++) {
			        pat[i] = 0;
			    }
			    
			    for (int i=0; i<n; i++) {
			        pat[scan.nextInt()-1] += 1;
			    }
			    
			    for (int i=0; i<n; i++) {
			        System.out.print(pat[i] + " ");
			    }
			    System.out.println("");
			    
			    t--;
			}
		}
	

}
