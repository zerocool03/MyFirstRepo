import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallLargerNo {
public static void main(String[] args) {
	int a[] = new int[] { 6, 3, 9, 8, 10, 2, 1, 15, 7 }; 
	int b[]= new int[]{ 6, 3, 9, 8, 10, 2, 1, 15, 7 }; 
	Arrays.sort(b);
	Map<Integer,Integer> arr = new HashMap<Integer,Integer>();
	
	
	
	for(int i=0;i<a.length-1;i++)
	{
		arr.put(b[i], b[i+1]);
	}
	System.out.println(arr);
	
	for(int i=0;i<a.length;i++)
	{
		if(arr.get(a[i]) == null) {
			System.out.print("_"+" ");
			continue;
		}
			
		System.out.print(arr.get(a[i])+" ");
	}
		
}
}
