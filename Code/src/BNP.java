import java.util.HashMap;
import java.util.Map;

class Stud
{
	int id;
	public Stud(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
	
	public boolean equals(Object o)
	{
		return true;
	}
	
	public int hashcode()
	{
		return 1;
	}
	
}

public class BNP
{
	public static void main(String[] args) {
		Map<Stud,String> map = new HashMap<>();
		Stud s1 = new Stud(1);
		Stud s2 = new Stud(2);
		map.put(s1, "s1");
		map.put(s2, "s2");
		System.out.println(map.size());
		map.remove(s2);
		System.out.println(map.size());
		
		
	}
}