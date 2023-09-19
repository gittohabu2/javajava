package course35;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();

		if (x >= 50) {
			int y = stdIn.nextInt();
			calc(x, y);
		} else {
			calc(x);
		}

	}

	static void calc(int a, int b) {
		System.out.println(a + b);
	}

	static void calc(int c) {
		System.out.println(c * 10);
	}

}
