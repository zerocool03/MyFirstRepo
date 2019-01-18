
interface MyData {

	default void print(String str) {
		System.out.println("inside interface print");
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	default boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : false;
	}
}

public class MyDataImpl implements MyData {

//	public boolean isNull(String str) {
//		System.out.println("Impl Null Check");
//
//		return str == null ? true : false;
//	}

	public static void main(String args[]) {
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
		obj.isNull("abc");
	}
}
