public abstract class Check {

	public static void main(String[] args) {
		
		String str = "I am a good boy";
		String[] eachword = str.split(" ", 5);
		for(String s:eachword)
		{
			System.out.println(s);
		}
	}
}


