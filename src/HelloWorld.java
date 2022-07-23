
public class HelloWorld {
	// Instance Variable
	int a = 3;

	public void test() {

		int a = 4;
		byte b = 3;

		a = b;

		// Explicit Typecasting
		b = (byte) a;

		System.out.println(a);

	}

	public static void main(String[] ar) {

		int a = 4;
		byte b = 3;

		// Implicit type casting
		a = b;

		System.out.println(a);

		// Explicit Typecasting
		b = (byte) a;

		// System.out.println(a);
	}
}