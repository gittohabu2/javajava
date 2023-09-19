package course40;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		printHello();
		multiply(10, 20);
		multiplymodori(20, 30);
		boolean tf = isEven(26);
		System.out.println(tf);
		String moji = getGreeting("こんにちは");
		System.out.println(moji);
	}

	static void printHello() {
		System.out.println("Hello,World!");
	}

	static void multiply(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}

	static int multiplymodori(int a2, int b2) {
		int x = a2 * b2;
		System.out.println(x);
		return x;
	}

	static boolean isEven(int number) {
		if (number % 2 == 0) {
			boolean x1 = true;
			return x1;
		} else {
			boolean x2 = false;
			return x2;
		}
	}

	static String getGreeting(String name) {
		String a2 = "こんにちは," + name;
		return a2;
	}

}
